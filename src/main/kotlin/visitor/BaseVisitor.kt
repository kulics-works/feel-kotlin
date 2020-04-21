package com.kulics.k.visitor

import antlr.generate.*
import antlr.generate.KParser.*
import com.kulics.k.*

open class BaseVisitor() : KParserBaseVisitor<any>() {
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
}
