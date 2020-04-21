package com.kulics.k

import antlr.generate.KLexer
import antlr.generate.KParser
import com.kulics.k.visitor.KLangVisitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    val input = CharStreams.fromString(
        """
        demo . {}
        a! : 1
        c : 2
        test : (->) {
            a = 1
            b = 2
            s = "hello " + a +  " world"
            ? a == 1 {
            } _ {
            }
            ? a : 1 {
            } _ {
            }
            arr : {1;2;3;4;5}
            @ i : arr {
                print(i)
            }
            @ i : 0~5 {
                print(i)
            }
            @ a < b {
                ~@
            }
        }
        
        pack : software \/ $ me {
            name : "k"
            age : "2"
            stop : (->){
            }
            title! str
            run : (->) {}
        } \/ (->$) {
        
        }
        
        software : $$ {
            title! str 
            run (->)
        }

    """.trimIndent()
    )
    val lexer = KLexer(input)
    val tokens = CommonTokenStream(lexer)
    val parser = KParser(tokens)
    val tree = parser.program() // parse
    val vt = KLangVisitor()
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