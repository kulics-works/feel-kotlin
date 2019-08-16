import LiteParser.*

class LiteLangVisitor() : LiteParserBaseVisitor<any>() {
    var selfID = ""
    var superID = ""
    var setID = ""

    var AllIDSet = mutableSetOf<str>()
    var CurrentIDSet = mutableListOf(mutableSetOf<str>())

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
                text = "`$text`"
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
        when {
            context.typeBasic() != null -> {
                permission = "public"
                text += context.typeBasic().text
                isVirtual = true
            }
            context.typeAny() != null -> {
                permission = "public"
                text += context.typeAny().text
                isVirtual = true
            }
            context.linqKeyword() != null -> {
                permission = "public"
                text += visit(context.linqKeyword())
                isVirtual = true
            }
            context.op.type == IDPublic -> {
                permission = "public"
                text += context.op.text
                isVirtual = true
            }
            context.op.type == IDPrivate -> {
                permission = "protected"
                text += context.op.text
                isVirtual = true
            }
        }
    }

    override fun visitIdExpression(context: IdExpressionContext) =
        Result().apply {
            data = "var"
            if (context.idExprItem().size > 1) {
                text = "("
                context.idExprItem().forEachIndexed { i, v ->
                    val subID = visit(v).to<Result>().text
                    text += if (i != 0) {
                        ", $subID"
                    } else {
                        subID
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
            obj += if (i > 0) {
                "," + visit(v)
            } else {
                "(" + visit(v)
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

    // expression

    override fun visitVariableStatement(context: VariableStatementContext) = run {
        var obj = ""
        val r1 = visit(context.idExpression()) as Result
        val r2 = visit(context.expression()) as Result
        obj = if (context.typeType() != null) {
            val Type = visit(context.typeType()) as str
            "${r1.text}:$Type = ${r2.text}$Wrap"
        } else {
            if (r1.isDefine || r1.text == selfID || r1.text == superID || r1.text == setID) {
                "${r1.text} = ${r2.text}$Wrap"
            } else {
                "var ${r1.text} = ${r2.text}$Wrap"
            }
        }
        obj
    }

    override fun visitVariableDeclaredStatement(context: VariableDeclaredStatementContext) = run {
        val Type = visit(context.typeType()) as str
        val r = visit(context.idExpression()) as Result
        "var ${r.text}:$Type$Wrap"
    }

    override fun visitAssignStatement(context: AssignStatementContext) = run {
        val r1 = visit(context.tupleExpression(0)) as Result
        val r2 = visit(context.tupleExpression(1)) as Result
        r1.text + visit(context.assign()) + r2.text + Wrap
    }

    override fun visitAssign(context: AssignContext) = context.op.text

    override fun visitExpressionStatement(context: ExpressionStatementContext) =
        visit(context.expression()).to<Result>().text + Wrap

    override fun visitExpression(context: ExpressionContext) = Result().apply {
        when (context.childCount) {
            3 -> {
                val e1 = visit(context.getChild(0)) as Result
                val e2 = visit(context.getChild(2))
                var op = visit(context.getChild(1))

                when (context.getChild(1)) {
                    is JudgeContext -> {
                        // # todo 如果左右不是bool类型值 ， 报错 #
                        data = Bool
                    }
                    is AddContext -> {
                        // # todo 如果左右不是number或text类型值 ， 报错 #
                        if (e1.data as str == Str || e2.to<Result>().data.to<str>() == Str) {
                            data = Str
                        } else if (e1.data as str == I32 && e2.to<Result>().data.to<str>() == I32) {
                            data = I32
                        } else {
                            data = F64
                        }
                    }
                    is MulContext -> {
                        // # todo 如果左右不是number类型值 ， 报错 #
                        if (e1.data as str == I32 && e2.to<Result>().data.to<str>() == I32) {
                            data = I32
                        } else {
                            data = F64
                        }
                    }
                    is PowContext -> {
                        // # todo 如果左右部署number类型 ， 报错 #
                        data = F64
                        op = when (op) {
                            "**" -> "pow"
                            "//" -> "root"
                            "%%" -> "log"
                            else -> op
                        }
                        text = "$op (${e1.text}, ${e2.to<Result>().text})"
                    }
                }
                text = e1.text + op + e2.to<Result>().text
            }
            2 -> {
                val r = visit(context.getChild(0)) as Result
                when (context.getChild(1)) {
                    is TypeConversionContext -> {
                        val e2 = visit(context.getChild(1)) as str
                        r.data = e2
                        r.text = "(${r.text} as $e2)"
                    }
                    is CallExpressionContext -> {
                        val e2 = visit(context.getChild(1)) as Result
                        r.text = r.text + e2.text
                    }
                    is CallFuncContext -> {
                        val e2 = visit(context.getChild(1)) as Result
                        r.text = r.text + e2.text
                    }
                    is CallElementContext -> {
                        val e2 = visit(context.getChild(1)) as Result
                        r.text = r.text + e2.text
                    }
                    else -> {
                        if (context.op.type == Bang) {
                            text = "ref $text"
                        } else if (context.op.type == Question) {
                            text += "?"
                        }
                        return@apply
                    }
                }
                return r
            }
            1 -> {
                return visit(context.getChild(0)) as Result
            }
            else -> {
            }
        }
    }

    override fun visitCallExpression(context: CallExpressionContext) = visit(context.id()).to<Result>().apply {
        text = ".$text"
        if (context.templateCall() != null) {
            text += visit(context.templateCall()) as str
        }
        when {
            context.callFunc() != null -> {
                val e2 = visit(context.callFunc()) as Result
                text += e2.text
            }
            context.callElement() != null -> {
                val e2 = visit(context.callElement()) as Result
                text += e2.text
            }
            context.callChannel() != null -> {
                val e2 = visit(context.callChannel()) as Result
                text += e2.text
            }
        }
    }

    override fun visitTypeConversion(context: TypeConversionContext) =
        visit(context.typeType()) as str

    override fun visitCall(context: CallContext) = context.op.text

    override fun visitWave(context: WaveContext) = context.op.text

    override fun visitJudgeType(context: JudgeTypeContext) = context.op.text

    override fun visitBitwise(context: BitwiseContext) = visit(context.getChild(0)) as str

    override fun visitBitwiseAnd(context: BitwiseAndContext) = "&"

    override fun visitBitwiseOr(context: BitwiseOrContext) = "|"

    override fun visitBitwiseXor(context: BitwiseXorContext) = "^"

    override fun visitBitwiseLeftShift(context: BitwiseLeftShiftContext) = "<<"

    override fun visitBitwiseRightShift(context: BitwiseRightShiftContext) = ">>"

    override fun visitJudge(context: JudgeContext) = when (val txt = context.op.text) {
        "><" -> "!="
        "&" -> "&&"
        "|" -> "||"
        else -> txt
    }

    override fun visitAdd(context: AddContext) = context.op.text

    override fun visitMul(context: MulContext) = context.op.text

    override fun visitPow(context: PowContext) = context.op.text

    override fun visitPrimaryExpression(context: PrimaryExpressionContext): any {
        if (context.childCount == 1) {
            val c = context.getChild(0)
            when {
                c is DataStatementContext -> return visit(context.dataStatement())
                c is IdContext -> return visit(context.id())
                context.t.type == Discard -> return Result().apply {
                    text = "_"
                    data = "var"
                }
            }
        } else if (context.childCount == 2) {
            val id = visit(context.id()) as Result
            val template = visit(context.templateCall()) as str
            return Result().apply {
                text = id.text + template
                data = id.text + template
            }
        }
        val r = visit(context.expression()) as Result
        return Result().apply {
            text = "(" + r.text + ")"
            data = r.data
        }
    }

    override fun visitExpressionList(context: ExpressionListContext) = Result().apply {
        var obj = ""
        for (i in 0 until context.expression().size) {
            val temp = visit(context.expression(i)) as Result
            obj += if (i == 0) {
                temp.text
            } else {
                ", ${temp.text}"
            }
        }
        text = obj
        data = "var"
    }

    override fun visitTemplateDefine(context: TemplateDefineContext) = TemplateItem().apply {
        Template += "<"
        for (i in 0 until context.templateDefineItem().size) {
            if (i > 0) {
                Template += ","
                if (Contract.isNotEmpty()) {
                    Contract += ","
                }
            }
            val r = visit(context.templateDefineItem(i)) as TemplateItem
            Template += r.Template
            Contract += r.Contract
        }
        Template += ">"
    }

    override fun visitTemplateDefineItem(context: TemplateDefineItemContext) = TemplateItem().apply {
        if (context.id().size == 1) {
            val id1 = context.id(0).text
            Template = id1
        } else {
            val id1 = context.id(0).text
            Template = id1
            val id2 = context.id(1).text
            Contract = " where $id1 : $id2 "
        }
    }

    override fun visitTemplateCall(context: TemplateCallContext) = run {
        var obj = ""
        obj += "<"
        for (i in 0 until context.typeType().size) {
            if (i > 0) {
                obj += ","
            }
            val r = visit(context.typeType(i))
            obj += r
        }
        obj += ">"
        obj
    }

    override fun visitCallElement(context: CallElementContext) =
        if (context.expression() == null) {
            Result().apply { text = visit(context.slice()) as str }
        } else {
            val r = visit(context.expression()) as Result
            r.text = "[${r.text}]"
            r
        }

    override fun visitSlice(context: SliceContext) = visit(context.getChild(0)) as str

    override fun visitSliceFull(context: SliceFullContext) = run {
        var order = ""
        var attach = ""
        when (context.op.text) {
            "<=" -> {
                order = "true"
                attach = "true"
            }
            "<" -> {
                order = "true"
            }
            ">=" -> {
                order = "false"
                attach = "true"
            }
            ">" -> {
                order = "false"
            }
        }
        val expr1 = visit(context.expression(0)) as Result
        val expr2 = visit(context.expression(1)) as Result
        ".slice(${expr1.text}..${expr2.text})"
    }

    override fun visitSliceStart(context: SliceStartContext) = run {
        var order = ""
        var attach = ""
        when (context.op.text) {
            "<=" -> {
                order = "true"
                attach = "true"
            }
            "<" -> {
                order = "true"
            }
            ">=" -> {
                order = "false"
                attach = "true"
            }
            ">" -> {
                order = "false"
            }
        }
        val expr = visit(context.expression()) as Result
        ".slice(${expr.text}..)"
    }

    override fun visitSliceEnd(context: SliceEndContext) = run {
        var order = ""
        var attach = "false"
        when (context.op.text) {
            "<=" -> {
                order = "true"
                attach = "true"
            }
            "<" -> {
                order = "true"
            }
            ">=" -> {
                order = "false"
                attach = "true"
            }
            ">" -> {
                order = "false"
            }
        }
        val expr = visit(context.expression()) as Result
        ".slice(..${expr.text})"
    }

    override fun visitCallFunc(context: CallFuncContext) = Result().apply {
        data = "var"
        text += if (context.tuple() != null) {
            visit(context.tuple()).to<Result>().text
        } else {
            "(${visit(context.lambda()).to<Result>().text})"
        }
    }

    override fun visitCallPkg(context: CallPkgContext) = Result().apply {
        data = visit(context.typeType())
        text = "${visit(context.typeType())}()"
        text += when {
            context.pkgAssign() != null -> visit(context.pkgAssign())
            context.listAssign() != null -> visit(context.listAssign())
            context.setAssign() != null -> visit(context.setAssign())
            context.dictionaryAssign() != null -> visit(context.dictionaryAssign())
            else -> ""
        }
    }

    override fun visitCallNew(context: CallNewContext) = Result().apply {
        data = visit(context.typeType())
        var param = ""
        if (context.expressionList() != null) {
            param = visit(context.expressionList()).to<Result>().text
        }
        text = "${visit(context.typeType())}($param)"
    }

    override fun visitPkgAssign(context: PkgAssignContext) = run {
        var obj = ""
        obj += "{"
        for (i in 0 until context.pkgAssignElement().size) {
            if (i == 0) {
                obj += visit(context.pkgAssignElement(i))
            } else {
                obj += ", ${visit(context.pkgAssignElement(i))}"
            }
        }
        obj += "}"
        obj
    }

    override fun visitListAssign(context: ListAssignContext) = run {
        var obj = ""
        obj += "{"
        for (i in 0 until context.expression().size) {
            val r = visit(context.expression(i)) as Result
            obj += if (i == 0) {
                r.text
            } else {
                ", ${r.text}"
            }
        }
        obj += "}"
        obj
    }

    override fun visitSetAssign(context: SetAssignContext) = run {
        var obj = ""
        obj += "{"
        for (i in 0 until context.expression().size) {
            val r = visit(context.expression(i)) as Result
            obj += if (i == 0) {
                r.text
            } else {
                ", ${r.text}"
            }
        }
        obj += "}"
        obj
    }

    override fun visitDictionaryAssign(context: DictionaryAssignContext) = run {
        var obj = ""
        obj += "{"
        for (i in 0 until context.dictionaryElement().size) {
            val r = visit(context.dictionaryElement(i)) as DicEle
            obj += if (i == 0) {
                r.text
            } else {
                ", ${r.text}"
            }
        }
        obj += "}"
        obj
    }

    override fun visitPkgAssignElement(context: PkgAssignElementContext) =
        visit(context.name()).to<str>() + " = " + visit(context.expression()).to<Result>().text

    override fun visitPkgAnonymous(context: PkgAnonymousContext) = Result().apply {
        data = "var"
        text = "new" + visit(context.pkgAnonymousAssign()) as str
    }

    override fun visitPkgAnonymousAssign(context: PkgAnonymousAssignContext) = run {
        var obj = ""
        obj += "{"
        for (i in 0 until context.pkgAnonymousAssignElement().size) {
            if (i == 0) {
                obj += visit(context.pkgAnonymousAssignElement(i))
            } else {
                obj += ", ${visit(context.pkgAnonymousAssignElement(i))}"
            }
        }
        obj += "}"
        obj
    }

    override fun visitPkgAnonymousAssignElement(context: PkgAnonymousAssignElementContext) =
        visit(context.name()).to<str>() + " = " + visit(context.expression()).to<Result>().text

    override fun visitCallAwait(context: CallAwaitContext) = Result().apply {
        val expr = visit(context.expression()) as Result
        data = "var"
        text = "await " + expr.text
    }

    override fun visitList(context: ListContext) = Result().apply {
        var type = Any
        for (i in 0 until context.expression().size) {
            val r = visit(context.expression(i)) as Result
            if (i == 0) {
                type = r.data as str
                text += r.text
            } else {
                if (type != r.data as str) {
                    type = Any
                }
                text += "," + r.text
            }
        }
        data = "$Lst<$type>"
        text = "mutableListOf($text)"
    }

    override fun visitSet(context: SetContext) = Result().apply {
        var type = Any
        for (i in 0 until context.expression().size) {
            val r = visit(context.expression(i)) as Result
            if (i == 0) {
                type = r.data as str
                text += r.text
            } else {
                if (type != r.data as str) {
                    type = Any
                }
                text += "," + r.text
            }
        }
        data = "$Set<$type>"
        text = "mutableSetOf($text)"
    }

    override fun visitDictionary(context: DictionaryContext) = Result().apply {
        var key = Any
        var value = Any
        for (i in 0 until context.dictionaryElement().size) {
            val r = visit(context.dictionaryElement(i)) as DicEle
            if (i == 0) {
                key = r.key
                value = r.value
                text += r.text
            } else {
                if (key != r.key) {
                    key = Any
                }
                if (value != r.value) {
                    value = Any
                }
                text += "," + r.text
            }
        }
        val type = "$key,$value"
        data = "$Dic<$type>"
        text = "mutableMapOf($text)"
    }

    override fun visitDictionaryElement(context: DictionaryElementContext) = DicEle().apply {
        val r1 = visit(context.expression(0)) as Result
        val r2 = visit(context.expression(1)) as Result
        key = r1.data as str
        value = r2.data as str
        text = "${r1.text} to ${r2.text}"
    }

    override fun visitStringExpression(context: StringExpressionContext) = Result().apply {
        text = "\"${context.TextLiteral().text.removePrefix("\"").removeSuffix("\"")}"
        for (item in context.stringExpressionElement()) {
            text += visit(item)
        }
        text += "\""
    }

    override fun visitStringExpressionElement(context: StringExpressionElementContext) = run {
        val r = visit(context.expression()) as Result
        val text = context.TextLiteral().text.removePrefix("\"").removeSuffix("\"")
        "\${ ${r.text} } $text "
    }

    override fun visitDataStatement(context: DataStatementContext) = Result().apply {
        when {
            context.nilExpr() != null -> {
                data = Any
                text = "null"
            }
            context.floatExpr() != null -> {
                data = F64
                text = visit(context.floatExpr()) as str
            }
            context.integerExpr() != null -> {
                data = I32
                text = visit(context.integerExpr()) as str
            }
            context.t.type == TextLiteral -> {
                data = Str
                text = context.TextLiteral().text
            }
            context.t.type == CharLiteral -> {
                data = Chr
                text = context.CharLiteral().text
            }
            context.t.type == TrueLiteral -> {
                data = Bool
                text = T
            }
            context.t.type == FalseLiteral -> {
                data = Bool
                text = F
            }
        }
    }

    override fun visitFloatExpr(context: FloatExprContext) =
        visit(context.integerExpr(0)).to<str>() + "." + visit(context.integerExpr(1)).to<str>()

    override fun visitIntegerExpr(context: IntegerExprContext) = context.NumberLiteral().text

    override fun visitFunctionExpression(context: FunctionExpressionContext) = Result().apply {
        // # 异步 #
        if (context.t.type == Right_Flow) {
            text += " async "
        }
        text += "fun ${visit(context.parameterClauseIn())}:${visit(context.parameterClauseOut())} $BlockLeft$Wrap"
        add_current_set()
        text += ProcessFunctionSupport(context.functionSupportStatement())
        delete_current_set()
        text += BlockRight + Wrap
        data = "var"
    }

    override fun visitLambda(context: LambdaContext) = Result().apply {
        data = "var"
        // # 异步 #
        if (context.t.type == Right_Flow) {
            text += "async "
        }
        text += BlockLeft
        if (context.lambdaIn() != null) {
            text += visit(context.lambdaIn())
        }
        text += "->"

        if (context.tupleExpression() != null) {
            text += visit(context.tupleExpression()).to<Result>().text
        } else {
            add_current_set()
            text += "{" + ProcessFunctionSupport(context.functionSupportStatement()) + "}"
            delete_current_set()
        }
        text += BlockRight
    }

    override fun visitLambdaIn(context: LambdaInContext) = run {
        var obj = ""
        for (i in 0 until context.id().size) {
            val r = visit(context.id(i)) as Result
            obj += if (i == 0) {
                r.text
            } else {
                ", ${r.text}"
            }
            add_id(r.text)
        }
        obj
    }

    override fun visitPlusMinus(context: PlusMinusContext) = Result().apply {
        val expr = visit(context.expression()) as Result
        val op = visit(context.add()) as str
        data = expr.data
        text = op + expr.text
    }

    override fun visitNegate(context: NegateContext) = Result().apply {
        val expr = visit(context.expression()) as Result
        data = expr.data
        text = "!" + expr.text
    }

    override fun visitBitwiseNotExpression(context: BitwiseNotExpressionContext) = Result().apply {
        val expr = visit(context.expression()) as Result
        data = expr.data
        text = "~" + expr.text
    }

    // logic -----------------------------

    override fun visitIteratorStatement(context: IteratorStatementContext) = Iterator().apply {
        if (context.op.text == ">=" || context.op.text == "<=") {
            attach = T
        }
        if (context.op.text == ">" || context.op.text == ">=") {
            order = F
        }
        if (context.expression().size == 2) {
            begin = visit(context.expression(0)) as Result
            end = visit(context.expression(1)) as Result
            step = Result().apply {
                data = I32
                text = "1"
            }
        } else {
            begin = visit(context.expression(0)) as Result
            end = visit(context.expression(1)) as Result
            step = visit(context.expression(2)) as Result
        }
    }

    override fun visitLoopStatement(context: LoopStatementContext) = run {
        var obj = ""
        val id = visit(context.id()).to<Result>().text

        val it = visit(context.iteratorStatement()) as Iterator
        val target = if (it.order == "true") {
            when {
                it.attach == "true" -> "${it.begin.text}..${it.end.text} step ${it.step.text}"
                else -> "${it.begin.text} until ${it.end.text} step ${it.step.text}"
            }
        } else {
            when {
                it.attach == "true" -> "${it.begin.text} downTo ${it.end.text} step ${it.step.text}"
                else -> "${it.begin.text} downTo ${it.end.text} step ${it.step.text}"
            }
        }

        obj += "for ($id in $target)"

        obj += BlockLeft + Wrap
        add_current_set()
        obj += ProcessFunctionSupport(context.functionSupportStatement())
        delete_current_set()
        obj += BlockRight + Wrap
        if (context.loopElseStatement() != null) {
            val elseContent = visit(context.loopElseStatement()) as str
            obj = "if (!can_range( $target ))  $elseContent else" + BlockLeft +
                    Wrap + obj + BlockRight + Wrap
        }
        obj
    }

    override fun visitLoopEachStatement(context: LoopEachStatementContext) = run {
        var obj = ""
        val arr = visit(context.expression()) as Result
        val target = arr.text
        val id = when (context.id().size) {
            2 -> "(${visit(context.id(0)).to<Result>().text}, ${visit(context.id(1)).to<Result>().text})"
            else -> visit(context.id(0)).to<Result>().text
        }

        obj += "for ($id in $target)"
        obj += BlockLeft + Wrap
        add_current_set()
        obj += ProcessFunctionSupport(context.functionSupportStatement())
        delete_current_set()
        obj += BlockRight + Wrap
        if (context.loopElseStatement() != null) {
            val elseContent = visit(context.loopElseStatement()) as str
            obj = "if (!can_range( $target ))  $elseContent else" + BlockLeft +
                    Wrap + obj + BlockRight + Wrap
        }
        obj
    }

    override fun visitLoopCaseStatement(context: LoopCaseStatementContext) = run {
        var obj = ""
        val expr = visit(context.expression()) as Result
        obj += "while (${expr.text})"
        obj += BlockLeft + Wrap
        add_current_set()
        obj += ProcessFunctionSupport(context.functionSupportStatement())
        delete_current_set()
        obj += BlockRight + Wrap
        if (context.loopElseStatement() != null) {
            val elseContent = visit(context.loopElseStatement()) as str
            obj = "if (! ${expr.text} )  $elseContent else" + BlockLeft +
                    Wrap + obj + BlockRight + Wrap
        }
        obj
    }

    override fun visitLoopElseStatement(context: LoopElseStatementContext) = run {
        var obj = BlockLeft + Wrap
        add_current_set()
        obj += ProcessFunctionSupport(context.functionSupportStatement())
        delete_current_set()
        obj += BlockRight + Wrap
        obj
    }

    override fun visitLoopJumpStatement(context: LoopJumpStatementContext) = "break$Wrap"

    override fun visitLoopContinueStatement(context: LoopContinueStatementContext) = "continue$Wrap"

    override fun visitJudgeCaseStatement(context: JudgeCaseStatementContext) = run {
        var obj = ""
        val expr = visit(context.expression()) as Result
        obj += "when (${expr.text}) $BlockLeft$Wrap"
        for (item in context.caseStatement()) {
            val r = visit(item) as str
            obj += r + Wrap
        }
        obj += BlockRight + Wrap
        obj
    }

    override fun visitCaseExprStatement(context: CaseExprStatementContext) =
        when {
            context.expression() != null -> {
                val expr = visit(context.expression()) as Result
                "${expr.text} -> $Wrap"
            }
            context.typeType() != null -> {
                var id = "it"
                if (context.id() != null) {
                    id = visit(context.id()).to<Result>().text
                }
                add_id(id)
                val type = visit(context.typeType()) as str
                "is $type ->$Wrap"
            }
            else -> {
                "else ->$Wrap"
            }
        }


    override fun visitCaseStatement(context: CaseStatementContext) = run {
        var obj = ""
        for (item in context.caseExprStatement()) {
            val r = visit(item) as str
            add_current_set()
            val process =
                "$BlockLeft${ProcessFunctionSupport(context.functionSupportStatement())}$BlockRight"
            delete_current_set()
            obj += r + process
        }
        obj
    }

    override fun visitJudgeStatement(context: JudgeStatementContext) = run {
        var obj = ""
        obj += visit(context.judgeIfStatement())
        for (it in context.judgeElseIfStatement()) {
            obj += visit(it)
        }
        if (context.judgeElseStatement() != null) {
            obj += visit(context.judgeElseStatement())
        }
        obj
    }

    override fun visitJudgeIfStatement(context: JudgeIfStatementContext) = run {
        val b = visit(context.expression()) as Result
        var obj = "if (${b.text}) $BlockLeft$Wrap"
        add_current_set()
        obj += ProcessFunctionSupport(context.functionSupportStatement())
        delete_current_set()
        obj += "$BlockRight$Wrap"
        obj
    }

    override fun visitJudgeElseIfStatement(context: JudgeElseIfStatementContext) = run {
        val b = visit(context.expression()) as Result
        var obj = "else if (${b.text}) $BlockLeft$Wrap"
        add_current_set()
        obj += ProcessFunctionSupport(context.functionSupportStatement())
        delete_current_set()
        obj += "$BlockRight$Wrap"
        obj
    }

    override fun visitJudgeElseStatement(context: JudgeElseStatementContext) = run {
        var obj = "else $BlockLeft$Wrap"
        add_current_set()
        obj += ProcessFunctionSupport(context.functionSupportStatement())
        delete_current_set()
        obj += "$BlockRight$Wrap"
        obj
    }

    override fun visitCheckStatement(context: CheckStatementContext) = run {
        var obj = "try $BlockLeft$Wrap"
        add_current_set()
        obj += ProcessFunctionSupport(context.functionSupportStatement())
        delete_current_set()
        obj += "$BlockRight$Wrap"
        for (item in context.checkErrorStatement()) {
            obj += "${visit(item)}$Wrap"
        }
        if (context.checkFinallyStatment() != null) {
            obj += visit(context.checkFinallyStatment())
        }
        obj
    }

    override fun visitCheckErrorStatement(context: CheckErrorStatementContext) = run {
        add_current_set()
        var obj = ""
        val id = visit(context.id()).to<Result>().text
        add_id(id)
        val Type = if (context.typeType() != null) {
            visit(context.typeType()) as str
        } else {
            "Exception"
        }
        obj += "catch($id:$Type)$BlockLeft$Wrap"
        obj += ProcessFunctionSupport(context.functionSupportStatement())
        delete_current_set()
        obj += BlockRight
        obj
    }

    override fun visitCheckFinallyStatment(context: CheckFinallyStatmentContext) = run {
        var obj = "finally $BlockLeft$Wrap"
        add_current_set()
        obj += ProcessFunctionSupport(context.functionSupportStatement())
        delete_current_set()
        obj += "$BlockRight$Wrap"
        obj
    }

    override fun visitUsingStatement(context: UsingStatementContext) = run {
        var obj = ""
        val r1 = visit(context.expression(0)) as Result
        val r2 = visit(context.expression(1)) as Result
        obj = if (context.typeType() != null) {
            val Type = visit(context.typeType()) as str
            "${r2.text}.use$BlockLeft ${r1.text} $Type -> "
        } else {
            "${r2.text}.use$BlockLeft ${r1.text} -> "
        }
        obj
    }

    override fun visitLinq(context: LinqContext) = Result().apply {
        data = "var"
        text += "from ${visit(context.expression(0)).to<Result>().text} "
        for (item in context.linqItem()) {
            text += " ${visit(item)}"
        }
        text += "${context.k.text} ${visit(context.expression(1)).to<Result>().text}"
    }

    override fun visitLinqItem(context: LinqItemContext) = run {
        var obj = visit(context.linqKeyword()) as str
        if (context.expression() != null) {
            obj += " ${visit(context.expression()).to<Result>().text}"
        }
        obj
    }

    override fun visitLinqKeyword(context: LinqKeywordContext) = visit(context.getChild(0))

    override fun visitLinqHeadKeyword(context: LinqHeadKeywordContext) = context.k.text

    override fun visitLinqBodyKeyword(context: LinqBodyKeywordContext) = context.k.text

// function -----------------------------

    private fun ProcessFunctionSupport(items: List<FunctionSupportStatementContext>) = run {
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

    override fun visitFunctionStatement(context: FunctionStatementContext) = run {
        val id = visit(context.id()) as Result
        var obj = ""
        //# 泛型 #
        var templateContract = ""
        if (context.templateDefine() != null) {
            val template = visit(context.templateDefine()) as TemplateItem
            obj += template.Template
            templateContract = template.Contract
        }
        var pout = visit(context.parameterClauseOut()) as str
        // # 异步 #
        if (context.t.type == Right_Flow) {
            pout = if (pout != "Unit") {
                pout
            } else {
                "Unit"
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
        obj += visit(context.parameterClauseIn()).to<str>() + ":" + pout + Wrap + BlockLeft + Wrap
        obj += ProcessFunctionSupport(context.functionSupportStatement())
        delete_current_set()
        obj += BlockRight + Wrap
        obj
    }

    override fun visitReturnStatement(context: ReturnStatementContext) =
        if (context.tupleExpression() != null) {
            "return ${visit(context.tupleExpression()).to<Result>().text}$Wrap"
        } else {
            "return$Wrap"
        }

    override fun visitYieldReturnStatement(context: YieldReturnStatementContext) =
        "yield return ${visit(context.tupleExpression()).to<Result>().text}$Wrap"

    override fun visitYieldBreakStatement(context: YieldBreakStatementContext) =
        "yield break$Wrap"

    override fun visitTuple(context: TupleContext) = Result().apply {
        data = "var"
        text = "("
        for (i in 0 until context.expression().size) {
            val r = visit(context.expression(i)) as Result
            text += if (i == 0) {
                r.text
            } else {
                ", ${r.text}"
            }
        }
        text += ")"
    }

    override fun visitTupleExpression(context: TupleExpressionContext) = Result().apply {
        data = "var"
        for (i in 0 until context.expression().size) {
            val r = visit(context.expression(i)) as Result
            text += if (i == 0) {
                r.text
            } else {
                ", ${r.text}"
            }
        }
        if (context.expression().size > 1) {
            text = "($text)"
        }
    }

    override fun visitParameterClauseIn(context: ParameterClauseInContext) = run {
        var obj = "("
        val temp = mutableListOf<str>()
        for (i in context.parameter().size - 1 downTo 0) {
            val p = visit(context.parameter(i)) as Parameter
            temp.add("${p.annotation} ${p.id}:${p.type} ${p.value}")
            add_id(p.id)
        }
        for (i in temp.size - 1 downTo 0) {
            obj += if (i == temp.size - 1) {
                temp[i]
            } else {
                ",  ${temp[i]}"
            }
        }

        obj += ")"
        obj
    }

    override fun visitParameterClauseOut(context: ParameterClauseOutContext) = run {
        var obj = ""
        if (context.parameter().size == 0) {
            obj += "Unit"
        } else if (context.parameter().size == 1) {
            val p = visit(context.parameter(0)) as Parameter
            obj += p.type
        }
        if (context.parameter().size > 1) {
            obj += "( "
            val temp = mutableListOf<str>()
            for (i in context.parameter().size - 1 downTo 0) {
                val p = visit(context.parameter(i)) as Parameter
                temp.add(p.type)
            }
            for (i in temp.size - 1 downTo 0) {
                obj += if (i == temp.size - 1) {
                    temp[i]
                } else {
                    ", ${temp[i]}"
                }
            }
            obj += " )"
        }
        obj
    }

    override fun visitParameterClauseSelf(context: ParameterClauseSelfContext) = Parameter().apply {
        val id = visit(context.id()) as Result
        this.id = id.text
        permission = id.permission
        type = visit(context.typeType()) as str
    }

    override fun visitParameter(context: ParameterContext) = Parameter().apply {
        val id = visit(context.id()) as Result
        this.id = id.text
        permission = id.permission
        if (context.annotationSupport() != null) {
            annotation = visit(context.annotationSupport()) as str
        }
        if (context.expression() != null) {
            value = "=" + visit(context.expression()).to<Result>().text
        }
        type = visit(context.typeType()) as str
    }

// namespace ----------------------------

    override fun visitStatement(context: StatementContext) = run {
        var obj = ""
        if (context.annotationSupport() != null) {
            obj += visit(context.annotationSupport())
        }
        val ns = visit(context.exportStatement()) as Namespace
        obj += "package ${ns.name + Wrap}"
        // import library
        obj += "import Library.*;$Wrap"
        obj += ns.imports + Wrap

        var content = ""
        add_current_set()
        for (item in context.namespaceSupportStatement()) {
            content += when (val v = visit(item)) {
                is str -> v
                else -> ""
            }
        }
        obj += content
        delete_current_set()
        obj
    }

    override fun visitExportStatement(context: ExportStatementContext) = run {
        var name = context.TextLiteral().text
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
        var ns = context.TextLiteral().text
        ns = ns.substring(1, ns.length - 2)
        ns = ns.replace("/", ".")
        obj += when {
            context.call() != null -> "import ${visit(context.id()).to<Result>().text}.$ns"
            context.id() != null -> "import ${visit(context.id()).to<Result>().text} as $ns"
            else -> "import $ns"
        }
        obj += Wrap
        obj
    }

    override fun visitNameSpaceItem(context: NameSpaceItemContext) = run {
        var obj = ""
        for (i in 0 until context.id().size) {
            val id = visit(context.id(i)) as Result
            obj += if (i == 0) {
                id.text
            } else {
                ".${id.text}"
            }
        }
        obj
    }

    override fun visitName(context: NameContext) = run {
        var obj = ""
        for (i in 0 until context.id().size) {
            val id = visit(context.id(i)) as Result
            obj += if (i == 0) {
                id.text
            } else {
                ".${id.text}"
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
        val id = visit(context.id()) as Result
        var obj = ""
        if (context.annotationSupport() != null) {
            obj += visit(context.annotationSupport())
        }
        //# 泛型 #
        var templateContract = ""
        if (context.templateDefine() != null) {
            val template = visit(context.templateDefine()) as TemplateItem
            obj += template.Template
            templateContract = template.Contract
        }
        //# 异步 #
        var pout = visit(context.parameterClauseOut()) as str
        if (context.t.type == Right_Flow) {
            pout = if (pout != "Unit") {
                pout
            } else {
                "Unit"
            }
            obj += " ${id.permission} fun $templateContract async ${id.text} "
        } else {
//            ? context.y > < nil {
//                ? pout > < "void" {
//                pout = "" IEnum "<" pout ">"
//            }
//            }
            obj += " ${id.permission} fun $templateContract ${id.text} "
        }
        add_current_set()
        obj += visit(context.parameterClauseIn()).to<str>() + ":" + pout + BlockLeft + Wrap
        obj += ProcessFunctionSupport(context.functionSupportStatement())
        delete_current_set()
        obj += BlockRight + Wrap
        obj
    }

    override fun visitNamespaceConstantStatement(context: NamespaceConstantStatementContext) = run {
        val id = visit(context.id()) as Result
        val expr = visit(context.expression()) as Result
        var typ = ""
        typ = if (context.typeType() != null) {
            visit(context.typeType()) as str
        } else {
            expr.data as str
        }

        var obj = ""
        if (context.annotationSupport() != null) {
            obj += visit(context.annotationSupport())
        }

        obj += "${id.permission} const val ${id.text}: $typ  =  ${expr.text} $Wrap"
        obj
    }

    override fun visitNamespaceVariableStatement(context: NamespaceVariableStatementContext) = run {
        val r1 = visit(context.id()) as Result
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

        obj += "${r1.permission} var ${r1.text}:$typ "
        obj += if (r2 != null) {
            " = " + r2.text + Wrap
        } else {
            Wrap
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

    // package -------------------------------

    override fun visitIncludeStatement(context: IncludeStatementContext) = visit(context.typeType())

    override fun visitPackageStatement(context: PackageStatementContext) = run {
        val id = visit(context.id()) as Result
        var obj = ""
        var extend = ""

        for (item in context.packageSupportStatement()) {
            if (item.getChild(0) is IncludeStatementContext) {
                if (extend == "") {
                    extend += visit(item)
                } else {
                    extend += "," + visit(item)
                }
            } else {
                obj += visit(item)
            }
        }
        obj += BlockRight + Wrap
        var header = ""
        if (context.annotationSupport() != null) {
            header += visit(context.annotationSupport()) as str
        }
        header += "${id.permission} class ${id.text}"
        // # 泛型 #
        var template = ""
        var templateContract = ""
        if (context.templateDefine() != null) {
            val item = visit(context.templateDefine()) as TemplateItem
            template += item.Template
            templateContract = item.Contract
            header += template
        }

        if (extend.isNotEmpty()) {
            header += ":$extend"
        }

        header += templateContract + BlockLeft + Wrap
        obj = header + obj
        obj
    }

    override fun visitPackageVariableStatement(context: PackageVariableStatementContext) = run {
        val r1 = visit(context.id()) as Result
        val isMutable = r1.isVirtual
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

        obj += "${r1.permission} var ${r1.text}:$typ"
        if (r2 != null) {
            obj += " = ${r2.text}$Wrap"
        } else {
            obj += Wrap
        }
        obj
    }

    override fun visitPackageControlSubStatement(context: PackageControlSubStatementContext) = Result().apply {
        var obj = ""
        add_current_set()
        val (id, typ) = GetControlSub(context.id(0).text)
        if (context.id(1) != null) {
            setID = context.id(1).text
        }
        if (context.functionSupportStatement().size > 0) {
            obj += id + BlockLeft
            for (item in context.functionSupportStatement()) {
                obj += visit(item)
            }
            obj += BlockRight + Wrap
        } else {
            obj += id
        }
        delete_current_set()
        setID = ""
        text = obj
        data = typ
    }

    override fun visitPackageNewStatement(context: PackageNewStatementContext) = run {
        var obj = ""
        val Self = visit(context.parameterClauseSelf()) as Parameter
        selfID = Self.id
        obj += "${Self.permission} class ${Self.type} $BlockLeft$Wrap"
        obj += "public constructor"
        // # 获取构造数据 #
        add_current_set()
        obj += visit(context.parameterClauseIn()) as str
        if (context.expressionList() != null) {
            obj += ":this(${visit(context.expressionList()).to<Result>().text})"
        }
        obj += BlockLeft + ProcessFunctionSupport(context.functionSupportStatement()) + BlockRight + Wrap
        delete_current_set()
        obj += BlockRight + Wrap
        selfID = ""
        obj
    }

    override fun visitPackageEventStatement(context: PackageEventStatementContext) = run {
        var obj = ""
        val id = visit(context.id()) as Result
        val nameSpace = visit(context.nameSpaceItem())
        obj += "public event $nameSpace ${id.text} $Wrap"
        obj
    }

    override fun visitProtocolStatement(context: ProtocolStatementContext) = run {
        val id = visit(context.id()) as Result
        var obj = ""
        var interfaceProtocol = ""
        var ptclName = id.text
        if (context.annotationSupport() != null) {
            obj += visit(context.annotationSupport())
        }
        for (item in context.protocolSupportStatement()) {
            val r = visit(item) as Result
            interfaceProtocol += r.text
        }
        obj += "public interface $ptclName"
        // # 泛型 #
        var templateContract = ""
        if (context.templateDefine() != null) {
            val template = visit(context.templateDefine()) as TemplateItem
            obj += template.Template
            templateContract = template.Contract
        }
        obj += templateContract + BlockLeft + Wrap
        obj += interfaceProtocol
        obj += BlockRight + Wrap
        obj
    }

    override fun visitProtocolControlStatement(context: ProtocolControlStatementContext) = Result().apply {
        val id = visit(context.id()) as Result
        var isMutable = id.isVirtual
        if (context.annotationSupport() != null) {
            text += visit(context.annotationSupport())
        }
        permission = "public"
        val type = visit(context.typeType()) as str
        text += "var ${id.text}:$type " + Wrap
//        text += BlockLeft
//        if (context.protocolControlSubStatement().size > 0) {
//            for (item in context.protocolControlSubStatement()) {
//                text += visit(item)
//            }
//        } else {
//            text += "get;set;"
//        }
//
//        text += BlockRight + Wrap
    }

    override fun visitProtocolControlSubStatement(context: ProtocolControlSubStatementContext) =
        GetControlSub(context.id().text).first

    override fun visitProtocolFunctionStatement(context: ProtocolFunctionStatementContext) = Result().apply {
        val id = visit(context.id()) as Result
        if (context.annotationSupport() != null) {
            text += visit(context.annotationSupport())
        }
        permission = "public"
        // # 异步 #
        var pout = visit(context.parameterClauseOut()) as str
//        if (context.t.type == Right_Flow) {
//            if (pout != "Unit") {
//                pout = "" Task "<" pout ">"
//            } else {
//                pout = Task
//            }
//        } else {
//            if (context.y != null) {
//                if (pout != "Unit") {
//                    pout = "" IEnum "<" pout ">"
//                }
//            }
//        }
        text += "fun "
        // # 泛型 #
        var templateContract = ""
        if (context.templateDefine() != null) {
            val template = visit(context.templateDefine()) as TemplateItem
            text += template.Template
            templateContract = template.Contract
        }
        text += id.text + visit(context.parameterClauseIn()).to<str>() + ":" + pout + templateContract + Wrap
    }

    // implement ---------------------------

    override fun visitImplementStatement(context: ImplementStatementContext) = run {
        val Self = visit(context.parameterClauseSelf()) as Parameter
        selfID = Self.id
        val isVirtual = ""
        var obj = ""
        var extends = ""
        if (context.typeType() != null) {
            extends += ":" + visit(context.typeType())
        }
        obj += "${Self.permission} class ${Self.type} $extends$BlockLeft$Wrap"
        for (item in context.implementSupportStatement()) {
            obj += visit(item)
        }
        obj += BlockRight + Wrap
        selfID = ""
        obj
    }

    override fun visitImplementFunctionStatement(context: ImplementFunctionStatementContext) = run {
        val id = visit(context.id()) as Result
        var isVirtual = ""
        if (id.isVirtual) {
            isVirtual = "open"
        }
        var obj = ""
        // # 泛型 #
        var templateContract = ""
        if (context.templateDefine() != null) {
            val template = visit(context.templateDefine()) as TemplateItem
            obj += template.Template
            templateContract = template.Contract
        }
        // # 异步 #
        var pout = visit(context.parameterClauseOut()) as str
        if (context.t.type == Right_Flow) {
            pout = if (pout != "Unit") {
                pout
            } else {
                "Unit"
            }
            obj += "${id.permission} $isVirtual fun $templateContract async ${id.text} "
        } else {
//            if (context.y != null) {
//                if (pout != "Unit") {
//                    pout = "" IEnum "<" pout ">"
//                }
//            }
            obj += " ${id.permission} fun $templateContract ${id.text} "
        }

        add_current_set()
        obj += visit(context.parameterClauseIn()).to<str>() + ":" + pout + BlockLeft + Wrap
        obj += ProcessFunctionSupport(context.functionSupportStatement())
        delete_current_set()
        obj += BlockRight + Wrap
        obj
    }

    override fun visitImplementControlStatement(context: ImplementControlStatementContext) = run {
        val r1 = visit(context.id()) as Result
        var isMutable = true // # r1.isVirtual #
        var isVirtual = ""
        if (r1.isVirtual) {
            isVirtual = "open"
        }
        var typ = ""
        typ = visit(context.typeType()) as str
        var obj = ""
        if (context.annotationSupport() != null) {
            obj += visit(context.annotationSupport())
        }
        obj += "${r1.permission} $isVirtual var ${r1.text}:$typ$Wrap"
        if (context.expression() != null) {
            val expr = visit(context.expression()) as Result
            obj += "get(){return ${expr.text}} $Wrap set(v){ ${expr.text} =v}"
        } else {
            for (item in context.packageControlSubStatement()) {
                val temp = visit(item) as Result
                obj += temp.text
            }
        }
        obj += Wrap
        obj
    }

    override fun visitOverrideStatement(context: OverrideStatementContext) = run {
        val Self = visit(context.parameterClauseSelf()) as Parameter
        selfID = Self.id
        superID = visit(context.id()).to<Result>().text
        var obj = ""
        obj += "${Self.permission} class ${Self.type}$BlockLeft$Wrap"
        for (item in context.overrideSupportStatement()) {
            obj += visit(item)
        }
        obj += BlockRight + Wrap
        selfID = ""
        superID = ""
        obj
    }

    override fun visitOverrideFunctionStatement(context: OverrideFunctionStatementContext) = run {
        val id = visit(context.id()) as Result
        val isVirtual = "override"
        var obj = ""
        // # 泛型 #
        var templateContract = ""
        if (context.templateDefine() != null) {
            val template = visit(context.templateDefine()) as TemplateItem
            obj += template.Template
            templateContract = template.Contract
        }
        // # 异步 #
        var pout = visit(context.parameterClauseOut()) as str
        if (context.t.type == Right_Flow) {
            pout = if (pout != "Unit") {
                pout
            } else {
                "Unit"
            }
            obj += "${id.permission} $isVirtual fun $templateContract async ${id.text} "
        } else {
//            if (context.y != null) {
//                if (pout != "Unit") {
//                    pout = "" IEnum "<" pout ">"
//                }
//            }
            obj += " ${id.permission} $isVirtual fun $templateContract ${id.text} "
        }

        add_current_set()
        obj += visit(context.parameterClauseIn()).to<str>() + ":" + pout + BlockLeft + Wrap
        obj += ProcessFunctionSupport(context.functionSupportStatement())
        delete_current_set()
        obj += BlockRight + Wrap
        obj
    }

    override fun visitOverrideControlStatement(context: OverrideControlStatementContext) = run {
        val r1 = visit(context.id()) as Result
        val isMutable = true // # r1.isVirtual #
        val isVirtual = "override"
        var typ = ""
        typ = visit(context.typeType()) as str
        var obj = ""
        if (context.annotationSupport() != null) {
            obj += visit(context.annotationSupport())
        }
        obj += "${r1.permission} $isVirtual var ${r1.text}:$typ$Wrap"
        if (context.expression() != null) {
            val expr = visit(context.expression()) as Result
            obj += "get(){return ${expr.text}} $Wrap set(v){ ${expr.text} =v}"
        } else {
            for (item in context.packageControlSubStatement()) {
                val temp = visit(item) as Result
                obj += temp.text
            }
        }
        obj += Wrap
        obj
    }

// type -------------------------------

    override fun visitTypeType(context: LiteParser.TypeTypeContext) =
        visit(context.getChild(0)) as str

    override fun visitTypeReference(context: LiteParser.TypeReferenceContext) = run {
        var obj = "ref "
        obj += when {
            context.typeNullable() != null -> visit(context.typeNullable())
            context.typeNotNull() != null -> visit(context.typeNotNull())
            else -> ""
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
        val `in` = visit(context.typeFunctionParameterClause(0)) as str
        var out = visit(context.typeFunctionParameterClause(1)) as str
        if (context.t.type == Right_Arrow) {
            if (out.isEmpty()) {
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
            if (out.isEmpty()) {
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
            obj += if (i == 0) {
                p
            } else {
                ", $p"
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
