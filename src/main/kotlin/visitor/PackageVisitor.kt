import LiteParser.*

open class PackageVisitor() : NamespaceVisitor() {
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
        obj += if (r2 != null) {
            " = ${r2.text}$Wrap"
        } else {
            Wrap
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

}