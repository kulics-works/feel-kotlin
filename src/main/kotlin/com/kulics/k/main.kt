package com.kulics.k


import com.kulics.k.antlr.generate.KLexer
import com.kulics.k.antlr.generate.KParser
import com.kulics.k.visitor.KLangVisitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    val input = CharStreams.fromFileName("/Users/kulics/Documents/kulics-works/k-kotlin/src/main/kotlin/test/example.k")
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