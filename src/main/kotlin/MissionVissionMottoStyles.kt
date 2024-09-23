package cxx
import kotlinx.css.*
import cxx.StyleSheet as StyleSheet

internal object MissionVissionMottoStyles:StyleSheet() {
    val generalwraper by classname {
        display=Display.flex
        gap=1.rem
        alignItems=Align.center
        justifyContent=JustifyContent.center
        media(onlyScreenMaxWidth(767.98.px)){
            flexDirection=FlexDirection.column
        }
    }
    val general by classname {
        display=Display.flex
        alignItems=Align.center
        justifyContent=JustifyContent.center
    }
    val missionwraper by classname {
        display= Display.flex
        flexDirection=FlexDirection.column
        justifyContent=JustifyContent.center
        alignItems=Align.center
        border = Border(2.px, BorderStyle.solid, Color("#efd8f0"))
        backgroundColor= Color("#f5e7f6")
        borderRadius=20.px
    }
    val hero by classname {
        display=Display.flex
        flexDirection=FlexDirection.column
        padding=Padding(16.px)
    }
    val picture by classname {
        display=Display.flex
        media(onlyScreenMaxWidth(767.98.px)){
            width=90.vw
        }
        media(onlyScreenMinWidth(767.98.px)){
            width=28.vw
        }
    }
    val schoolmission by classname {
        fontFamily="Markpro"
        fontSize=25.px
        fontWeight= FontWeight.w500
        color= Color.black
    }
    val paragraph by classname {
        fontFamily="Markpro"
        fontSize=22.px
        display=Display.flex
        color=Color("#736e74")
        media(onlyScreenMinWidth(767.98.px)){
            width=26.vw
        }
    }
}