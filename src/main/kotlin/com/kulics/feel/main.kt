package com.kulics.feel

import com.kulics.feel.antlr.generate.FeelLexer
import com.kulics.feel.antlr.generate.FeelParser
import com.kulics.feel.visitor.KLangVisitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    val input = CharStreams.fromFileName("/Users/kulics/Documents/kulics-works/feel-kotlin/src/main/kotlin/test/example.feel")
    val lexer = FeelLexer(input)
    val tokens = CommonTokenStream(lexer)
    val parser = FeelParser(tokens)
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