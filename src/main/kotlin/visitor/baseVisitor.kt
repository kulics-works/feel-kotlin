import LiteParser.*

class LiteLangVisitor() : LiteParserBaseVisitor<any>() {
    var selfID = ""
    var superID = ""
    var setID = ""

    var AllIDSet = mutableSetOf<str>()
    var CurrentIDSet = mutableListOf<set<str>>()

    fun has_id(id: str) =
        AllIDSet.contains(id) || CurrentIDSet.peek().contains(id)


    fun add_id(id: str) =
        CurrentIDSet.peek().add(id)


    fun add_current_set() {
        for (k in CurrentIDSet.peek()) {
            AllIDSet.add(k)
        }
        CurrentIDSet.push(mutableSetOf<str>())
    }

    fun delete_current_set() {
        // printJSON(me.AllIDSet)
        AllIDSet.removeAll(CurrentIDSet.peek())
        // printJSON(me.AllIDSet)
        CurrentIDSet.pop()
    }
    // base -------------------------------------

    override fun visitProgram(context: ProgramContext) = run {
        val StatementList = context.statement()
        var Result = ""
        for (item in StatementList) {
            Result += visitStatement(item)
        }
        Result
    }

    override fun visitId(context: IdContext) =
        Result().apply {
            data = "var"
            val first = visit(context.getChild(0)).to<Result>()
            permission = first.permission
            text = first.text
            isVirtual = first.isVirtual
            if (context.childCount >= 2) {
                for (i in 1 until context.childCount) {
                    val other = visit(context.getChild(i)).to<Result>()
                    text += "_${other.text}"
                }
            }
            if (keywords.any { t -> t == text }) {
                text = "`${text}`"
            }
            text = when (text) {
                selfID -> "this"
                superID -> "base"
                setID -> "value"
                else -> text
            }
        }


    override fun visitIdItem(context: IdItemContext) = Result().apply {
        data = "var"
        if (context.typeBasic() != null) {
            permission = "public"
            text += context.typeBasic().getText()
            isVirtual = true
        } else if (context.typeAny() != null) {
            permission = "public"
            text += context.typeAny().getText()
            isVirtual = true
        } else if (context.linqKeyword() != null) {
            permission = "public"
            text += visit(context.linqKeyword())
            isVirtual = true
        } else if (context.op.type == IDPublic) {
            permission = "public"
            text += context.op.text
            isVirtual = true
        } else if (context.op.type == IDPrivate) {
            permission = "protected"
            text += context.op.text
            isVirtual = true
        }
    }

    override fun visitIdExpression(context: IdExpressionContext) =
        Result().apply {
            data = "var"
            if (context.idExprItem().size > 1) {
                text = "("
                context.idExprItem().forEachIndexed { i, v ->
                    val subID = visit(v).to<Result>().text
                    if (i != 0) {
                        text += ", " + subID
                    } else {
                        text += subID
                    }
                    if (has_id(subID)) {
                        isDefine = true
                    } else {
                        add_id(subID)
                    }
                }
                text += ")"
            } else {
                return visit(context.idExprItem(0)).to<Result>().apply {
                    if (has_id(text)) {
                        isDefine = true
                    } else {
                        add_id(text)
                    }
                }
            }
        }

    override fun visitIdExprItem(context: IdExprItemContext) = visit(context.getChild(0))

    override fun visitBoolExpr(context: BoolExprContext) =
        Result().apply {
            if (context.t.type == TrueLiteral) {
                data = Bool
                text = T
            } else if (context.t.type == FalseLiteral) {
                data = Bool
                text = F
            }
        }

    override fun visitAnnotationSupport(context: AnnotationSupportContext) =
        visit(context.annotation()) as str

    override fun visitAnnotation(context: AnnotationContext) = run {
        var obj = ""
        var id = ""
        if (context.id() != null) {
            id = "${visit(context.id()).to<Result>().text}:"
        }

        val r = visit(context.annotationList()) as str
        obj += "$$id $r "
        obj
    }

    override fun visitAnnotationList(context: AnnotationListContext) = run {
        var obj = ""
        context.annotationItem().forEachIndexed { i, v ->
            if (i > 0) {
                obj += "\n$${visit(v)}"
            } else {
                obj += visit(v)
            }
        }
        obj
    }

    override fun visitAnnotationItem(context: AnnotationItemContext) = run {
        var obj = ""
        obj += visit(context.id()).to<Result>().text
        context.annotationAssign().forEachIndexed { i, v ->
            if (i > 0) {
                obj += "," + visit(v)
            } else {
                obj += "(" + visit(v)
            }
        }
        if (context.annotationAssign().size > 0) {
            obj += ")"
        }
        obj
    }

    override fun visitAnnotationAssign(context: AnnotationAssignContext) = run {
        var id = ""
        if (context.id() != null) {
            id = visit(context.id()).to<Result>().text + "="
        }
        val r = visit(context.expression()) as Result
        id + r.text
    }

    // function -----------------------------

    fun ProcessFunctionSupport(items: List<FunctionSupportStatementContext>) = run {
        var obj = ""
        var content = ""
        val lazy = mutableListOf<str>()
        for (item in items) {
            if (item.getChild(0) is UsingStatementContext) {
                lazy.add("}")
                content += "using" + visit(item) as str + BlockLeft + Wrap
            } else {
                content += visit(item)
            }
        }
        if (lazy.size > 0) {
            for (i in lazy.size - 1 downTo 0) {
                content += BlockRight
            }
        }
        obj += content
        obj
    }

    // namespace ----------------------------

    override fun visitStatement(context: StatementContext) = run {
        var obj = ""
        val ns = visit(context.exportStatement()) as Namespace
        // import library
        obj += "import Library;$Wrap"
        obj += ns.imports + Wrap
        if (context.annotationSupport() != null) {
            obj += visit(context.annotationSupport())
        }
        obj += "package ${ns.name + Wrap}"

        var content = ""
        add_current_set()
        for (item in context.namespaceSupportStatement()) {
            content += visit(item)
        }
        obj += content
        delete_current_set()
        obj += BlockRight + Wrap
        obj
    }

    override fun visitExportStatement(context: ExportStatementContext) = run {
        var name = context.TextLiteral().getText()
        name = name.substring(1, name.length - 2)
        name = name.replace("/", ".")
        val obj = Namespace().apply {
            this.name = name
        }
        for (item in context.importStatement()) {
            obj.imports += visit(item) as str
        }
        obj
    }

    override fun visitImportStatement(context: ImportStatementContext) = run {
        var obj = ""
        if (context.annotationSupport() != null) {
            obj += visit(context.annotationSupport())
        }
        var ns = context.TextLiteral().getText()
        ns = ns.substring(1, ns.length - 2)
        ns = ns.replace("/", ".")
        if (context.call() != null) {
            obj += "import ${visit(context.id()).to<Result>().text}.$ns"
        } else if (context.id() != null) {
            obj += "import ${visit(context.id()).to<Result>().text} as $ns"
        } else {
            obj += "import $ns"
        }
        obj += Wrap
        obj
    }

    override fun visitNameSpaceItem(context: NameSpaceItemContext) = run {
        var obj = ""
        for (i in 0 until context.id().size) {
            val id = visit(context.id(i)) as Result
            if (i == 0) {
                obj += id.text
            } else {
                obj += ".${id.text}"
            }
        }
        obj
    }

    override fun visitName(context: NameContext) = run {
        var obj = ""
        for (i in 0 until context.id().size) {
            val id = visit(context.id(i)) as Result
            if (i == 0) {
                obj += "" + id.text
            } else {
                obj += "." + id.text
            }
        }
        obj
    }

    override fun visitEnumStatement(context: EnumStatementContext) = run {
        var obj = ""
        val id = visit(context.id()) as Result
        var header = ""
        val typ = visit(context.typeType()) as str
        if (context.annotationSupport() != null) {
            header += visit(context.annotationSupport())
        }
        header += id.permission + " enum " + id.text + ":" + typ
        header += Wrap + BlockLeft + Wrap
        for (i in 0 until context.enumSupportStatement().size) {
            obj += visit(context.enumSupportStatement(i))
        }
        obj += BlockRight + Wrap
        obj = header + obj
        obj
    }

    override fun visitEnumSupportStatement(context: EnumSupportStatementContext) = run {
        val id = visit(context.id()) as Result
        if (context.integerExpr() != null) {
            var op = ""
            if (context.add() != null) {
                op = visit(context.add()) as str
            }
            id.text += " = $op ${visit(context.integerExpr())}"
        }
        id.text + ","
    }

    override fun visitNamespaceFunctionStatement(context: NamespaceFunctionStatementContext) = run {
        var id = visit(context.id()) as Result
        var obj = ""
        if (context.annotationSupport() != null) {
            obj += visit(context.annotationSupport())
        }
        //# 泛型 #
        var templateContract = ""
        if (context.templateDefine() != null) {
            var template = visit(context.templateDefine()) as TemplateItem
            obj += template.Template
            templateContract = template.Contract
        }
        //# 异步 #
        var pout = visit(context.parameterClauseOut()) as str
        if (context.t.type == LiteParser.Right_Flow) {
            if (pout != "Unit") {
                pout = pout
            } else {
                pout = "Unit"
            }
            obj += " ${id.permission} $templateContract async ${id.text} "
        } else {
//            ? context.y > < nil {
//                ? pout > < "void" {
//                pout = "" IEnum "<" pout ">"
//            }
//            }
            obj += " ${id.permission} $templateContract ${id.text} "
        }
        add_current_set()
        obj += visit(context.parameterClauseIn()).to<str>() + pout + Wrap + BlockLeft + Wrap
        obj += ProcessFunctionSupport(context.functionSupportStatement())
        delete_current_set()
        obj += BlockRight + Wrap
        obj
    }

    override fun visitNamespaceConstantStatement(context: NamespaceConstantStatementContext) = run {
        val id = visit(context.id()) as Result
        val expr = visit(context.expression()) as Result
        var typ = ""
        if (context.typeType() != null) {
            typ = visit(context.typeType()) as str
        } else {
            typ = expr.data as str
        }

        var obj = ""
        if (context.annotationSupport() != null) {
            obj += visit(context.annotationSupport())
        }

        obj += "${id.permission} const val ${id.text}: $typ  =  ${expr.text} $Wrap"
        obj
    }

    override fun visitNamespaceVariableStatement(context: NamespaceVariableStatementContext) = run {
        var r1 = visit(context.id()) as Result
        add_id(r1.text)
        var isMutable = r1.isVirtual
        var typ = ""
        var r2: Result? = null
        if (context.expression() != null) {
            r2 = visit(context.expression()) as Result
            typ = r2.data as str
        }
        if (context.typeType() != null) {
            typ = visit(context.typeType()) as str
        }
        var obj = ""
        if (context.annotationSupport() != null) {
            obj += visit(context.annotationSupport())
        }

        obj += "${r1.permission} ${r1.text}:$typ "
        if (r2 != null) {
            obj += " = " + r2.text + Wrap
        } else {
            obj += Wrap
        }
        obj
    }

    override fun visitNamespaceControlStatement(context: NamespaceControlStatementContext) = run {
        val r1 = visit(context.id()) as Result
        add_id(r1.text)
        var isMutable = r1.isVirtual
        var typ = ""
        typ = visit(context.typeType()) as str
        var obj = ""
        if (context.annotationSupport() != null) {
            obj += visit(context.annotationSupport())
        }

        obj += " ${r1.permission} ${r1.text}:$typ"
        if (context.expression() != null) {
            val expr = visit(context.expression()) as Result
            obj += "get() { return ${expr.text} } $Wrap set(v){ ${expr.text} = v }"
        } else {
            for (item in context.packageControlSubStatement()) {
                val temp = visit(item) as Result
                obj += temp.text
            }
        }
        obj += BlockRight + Wrap
        obj
    }

    // type -------------------------------

    override fun visitTypeType(context: LiteParser.TypeTypeContext) =
        visit(context.getChild(0)) as str

    override fun visitTypeReference(context: LiteParser.TypeReferenceContext) = run {
        var obj = "ref "
        if (context.typeNullable() != null) {
            obj += visit(context.typeNullable())
        } else if (context.typeNotNull() != null) {
            obj += visit(context.typeNotNull())
        }
        obj
    }

    override fun visitTypeNullable(context: TypeNullableContext) =
        visit(context.typeNotNull()) as str + "?"

    override fun visitTypeTuple(context: TypeTupleContext) = run {
        var obj = ""
        obj += "("
        context.typeType().forEachIndexed { i, v ->
            if (i == 0) {
                obj += visit(v)
            } else {
                obj += "," + visit(v)
            }
        }
        obj += ")"
        obj
    }

    override fun visitTypeArray(context: TypeArrayContext) =
        "$Arr<${visit(context.typeType())}>"

    override fun visitTypeList(context: TypeListContext) =
        "$Lst<${visit(context.typeType())}>"

    override fun visitTypeSet(context: TypeSetContext) =
        "$Set<${visit(context.typeType())}>"

    override fun visitTypeDictionary(context: TypeDictionaryContext) =
        "$Dic<${visit(context.typeType(0))},${visit(context.typeType(1))}>"

    override fun visitTypeStack(context: TypeStackContext) =
        "$Stk<${visit(context.typeType())}>"

    override fun visitTypePackage(context: TypePackageContext) = run {
        var obj = ""
        obj += visit(context.nameSpaceItem())
        if (context.templateCall() != null) {
            obj += visit(context.templateCall())
        }
        obj
    }

    override fun visitTypeFunction(context: TypeFunctionContext) = run {
        var obj = ""
        var fn: () -> Unit
        val `in` = visit(context.typeFunctionParameterClause(0)) as str
        var out = visit(context.typeFunctionParameterClause(1)) as str
        if (context.t.type == Right_Arrow) {
            if (out.length == 0) {
                obj = "($`in`)->Unit"
            } else {
                if (out.indexOfFirst { it == ',' } >= 0) {
                    out = "( $out )"
                }
//                if (context.y != null) {
//                    out = "" IEnum "<" out ">"
//                }
                obj = "($`in`)->$out"
            }
        } else {
            if (out.length == 0) {
                obj = "($`in`)->Unit"
            } else {
                if (out.indexOfFirst { it == ',' } >= 0) {
                    out = "( $out )"
                }
//                if (context.y != null) {
//                    out = "" IEnum "<" out ">"
//                }
                obj = "($`in`)->$out"
            }
        }
        obj
    }

    override fun visitTypeAny(context: TypeAnyContext) = Any

    override fun visitTypeFunctionParameterClause(context: TypeFunctionParameterClauseContext) = run {
        var obj = ""
        for (i in 0 until context.typeType().size) {
            val p = visit(context.typeType(i)) as str
            if (i == 0) {
                obj += p
            } else {
                obj += ", $p"
            }
        }
        obj
    }

    override fun visitTypeBasic(context: TypeBasicContext) = when (context.t.type) {
        TypeI8 -> I8
        TypeU8 -> U8
        TypeI16 -> I16
        TypeU16 -> U16
        TypeI32 -> I32
        TypeU32 -> U32
        TypeI64 -> I64
        TypeU64 -> U64
        TypeF32 -> F32
        TypeF64 -> F64
        TypeChr -> Chr
        TypeStr -> Str
        TypeBool -> Bool
        TypeInt -> Int
        TypeNum -> Num
        TypeByte -> U8
        else -> Any
    }
}

