package cxx

import kotlinx.css.CssBuilder

abstract class StyleSheet(path: String? = null) : CssBuilder by CssBuilder() {
    val path by lazy { path ?: this::class.qualifiedName?.lowercase() ?: "unknown" }

    internal val qualifier by lazy { Qualifier() }

    internal inner class Qualifier {
        val doted by lazy { path }
        val dashed by lazy { path.replace(".", "_") }
    }

    override fun toString() = buildString {
        append(declarations)
        buildRules(indent)
    }
}