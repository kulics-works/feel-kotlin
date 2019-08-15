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

    override fun visitProgram(context: LiteParser.ProgramContext) = run {
        val StatementList = context.statement()
        var Result = ""
        for (item in StatementList) {
            Result += visitStatement(item)
        }
        Result
    }

    override fun visitId(context: LiteParser.IdContext) =
        Result().apply {
            data = "var"
            val first = visit(context.getChild(0)) as Result
            permission = first.permission
            text = first.text
            isVirtual = first.isVirtual
            if (context.childCount >= 2) {
                for (i in 1 until context.childCount) {
                    val other = visit(context.getChild(i)) as Result
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


    override fun visitIdItem(context: LiteParser.IdItemContext) = Result().apply {
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
        } else if (context.op.type == LiteParser.IDPublic) {
            permission = "public"
            text += context.op.text
            isVirtual = true
        } else if (context.op.type == LiteParser.IDPrivate) {
            permission = "protected"
            text += context.op.text
            isVirtual = true
        }
    }

    override fun visitIdExpression(context: LiteParser.IdExpressionContext) =
        Result().apply {
            data = "var"
            if (context.idExprItem().size > 1) {
                text = "("
                context.idExprItem().forEachIndexed { i, v ->
                    val subID = (visit(v) as Result).text
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
                return (visit(context.idExprItem(0)) as Result).apply {
                    if (has_id(text)) {
                        isDefine = true
                    } else {
                        add_id(text)
                    }
                }
            }
        }

    override fun visitIdExprItem(context: LiteParser.IdExprItemContext) = visit(context.getChild(0))

    override fun visitBoolExpr(context: LiteParser.BoolExprContext) =
        Result().apply {
            if (context.t.type == LiteParser.TrueLiteral) {
                data = Bool
                text = T
            } else if (context.t.type == LiteParser.FalseLiteral) {
                data = Bool
                text = F
            }
        }

    override fun visitAnnotationSupport(context: LiteParser.AnnotationSupportContext) =
        visit(context.annotation()) as str

    override fun visitAnnotation(context: LiteParser.AnnotationContext) = run {
        var obj = ""
        var id = ""
        if (context.id() != null) {
            id = "${(visit(context.id()) as Result).text}:"
        }

        val r = visit(context.annotationList()) as str
        obj += "$$id $r "
        obj
    }

    override fun visitAnnotationList(context: LiteParser.AnnotationListContext) = run {
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

    override fun visitAnnotationItem(context: LiteParser.AnnotationItemContext) = run {
        var obj = ""
        obj += (visit(context.id()) as Result).text
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

    override fun visitAnnotationAssign(context: LiteParser.AnnotationAssignContext) = run {
        var id = ""
        if (context.id() != null) {
            id = (visit(context.id()) as Result).text + "="
        }
        val r = visit(context.expression()) as Result
        id + r.text
    }
}

