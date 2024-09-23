 package cxx

import cxx.internal.ClassRuleSetBuilder
import kotlinx.css.RuleSet
import kotlin.properties.ReadOnlyProperty

private fun StyleSheet.selector(
    selector: String,
    block: ClassRuleSetBuilder.() -> Unit
) {
    val ruleSet = ClassRuleSetBuilder("  ", parent = this).apply(block)
    selector.invoke(ruleSet)
    ruleSet.mediaRules.forEach { (query, ruleset) ->
        media(query) { selector(ruleset) }
    }
}

fun StyleSheet.id(
    id: String? = null,
    block: RuleSet
) = ReadOnlyProperty<StyleSheet, String> { _, property ->
    val identifier = "${qualifier.dashed}_" + (id ?: property.name)
    selector("#$identifier", block)
    identifier
}

fun StyleSheet.classname(
    classname: String? = null,
    block: ClassRuleSetBuilder.() -> Unit
) = ReadOnlyProperty<StyleSheet, String> { _, property ->
    val clazz = "${qualifier.dashed}_" + (classname ?: property.name)
    selector(".$clazz", block)
    clazz
}