import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

fun main() {
    println("hello lite")
    val input = CharStreams.fromString(
        """
        "lite" {}
        a int = 1
        test(->) {
        
        }
        
    """.trimIndent()
    )
    val lexer = LiteLexer(input)
    val tokens = CommonTokenStream(lexer)
    val parser = LiteParser(tokens)
    val tree = parser.program() // parse
    val vt = LiteLangVisitor()
    val result = vt.visitProgram(tree)
    println(result)
}

typealias any = Any
typealias str = String
typealias int = Int
typealias bool = Boolean
typealias list<T> = MutableList<T>
typealias map<K, V> = MutableMap<K, V>
typealias set<T> = MutableSet<T>