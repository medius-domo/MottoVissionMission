package cxx

import kotlinx.html.FlowOrMetaDataOrPhrasingContent
import kotlinx.html.link
import kotlin.reflect.KProperty

fun <S : StyleSheet> FlowOrMetaDataOrPhrasingContent.link(sheet: S): S {
    link(href = "/${sheet.path.lowercase()}.css", rel = "stylesheet", type = "text/css")
    return sheet
}

operator fun <S : StyleSheet> S.getValue(
    thisRef: Nothing?,
    property: KProperty<*>
): S {
    thisRef?.link(this)
    return this
}