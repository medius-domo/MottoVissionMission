package cxx.internal

import kotlinx.css.CssBuilder
import kotlinx.css.Rule
import kotlinx.css.RuleContainer
import kotlinx.css.RuleSet

class ClassRuleSetBuilder(
    override val indent: String,
    override var parent: RuleContainer?
) : CssBuilder by CssBuilder() {
    internal val mediaRules = mutableListOf<Chunk>()

    override fun media(query: String, block: RuleSet): Rule {
        val css = CssBuilder("  ", false)
        mediaRules.add(Chunk(query, block))
        return Rule(query, css)
    }

    override fun toString() = buildString {
        append(declarations)
        buildRules(indent)
    }
}