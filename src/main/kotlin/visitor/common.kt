class Result() {
    var data: any? = null
    var text = ""
    var permission = ""
    var isVirtual = false
    var isDefine = false
}

fun <T> list<T>.peek(): T {
    return this[this.size - 1]
}

fun <T> list<T>.push(new: T) {
    this.add(new)
}

fun <T> list<T>.pop() {
    this.removeAt(this.size - 1)
}

const val Wrap = "\r\n"

const val Any = "Any"
const val Int = "Int"
const val Num = "Double"
const val I8 = "Byte"
const val I16 = "Short"
const val I32 = "Int"
const val I64 = "Long"

const val U8 = "byte"
const val U16 = "ushort"
const val U32 = "uint"
const val U64 = "ulong"

const val F32 = "Float"
const val F64 = "Double"

const val Bool = "Boolean"
const val T = "true"
const val F = "false"

const val Chr = "Char"
const val Str = "String"
const val Lst = "List"
const val Set = "Set"
const val Dic = "Map"
const val Stk = "Stack"

const val BlockLeft = "{"
const val BlockRight = "}"

val keywords = arrayOf(
    "abstract", "as", "base", "bool", "break", "byte", "case", "catch",
    "char", "checked", "class", "const", "continue", "decimal", "default", "delegate", "do", "double", "_",
    "enum", "event", "explicit", "extern", "false", "finally", "fixed", "float", "for", "foreach", "goto",
    "?", "implicit", "in", "int", "interface", "internal", "is", "lock", "long", "namespace", "new", "null",
    "object", "operator", "out", "override", "params", "private", "protected", "public", "readonly", "ref",
    "return", "sbyte", "sealed", "short", "sizeof", "stackalloc", "static", "string", "struct", "switch",
    "this", "throw", "true", "try", "typeof", "uint", "ulong", "unchecked", "unsafe", "ushort", "using",
    "virtual", "void", "volatile", "while"
)