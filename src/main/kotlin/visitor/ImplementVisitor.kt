import LiteParser.*

open class ImplementVisitor() : PackageVisitor() {
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
}