import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

fun main() {
    val input = CharStreams.fromString(
        """
        "lite" {}
        a int = 1
        c int : 2
        test(->) {
            a = 1
            b = 2
            s = "hello " a " world"
            ? a == 1 {
            } _ {
            }
            a ? 1 {
            } _ {
            }
            arr = {1,2,3,4,5}
            i @ arr {
                print(i)
            }
            i @ 0..<5 {
                print(i)
            }
            @ a < b {
                @..
            }
        }
        
        pack -> {
            name = "lite"
            age = "2"
        }
        
        me pack() {
        
        }
        
        me pack -> {
            stop(->){}
        }
        
        me pack -> software {
            title(me.name) str
            run(->) {}
        }
        
        software <- {
            title() str
            run(->)
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