import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

fun main() {
    print("hello lite")
    val input = CharStreams.fromString(
        """
        "lite" {}
        
    """.trimIndent()
    )
    val lexer = LiteLexer(input)
    val tokens = CommonTokenStream(lexer)
    val parser = LiteParser(tokens)
    val tree = parser.program() // parse
    val vt = LiteLangVisitor()
    vt.visitProgram(tree)
}

typealias any = Any
typealias str = String
typealias int = Int
typealias bool = Boolean
typealias list<T> = MutableList<T>
typealias map<K, V> = MutableMap<K, V>
typealias set<T> = MutableSet<T>