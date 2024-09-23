package cxx.MttoMissionVission

import cxx.MissionVissionMottoStyles
import kotlinx.html.*

internal fun DIV.MottoMissionVission(imagepath:String,missiontitle:String,words:String){
    div(classes = MissionVissionMottoStyles.general) {
        div(classes = MissionVissionMottoStyles.missionwraper) {
            div(classes = MissionVissionMottoStyles.hero) {
                div(classes = "img") {
                    img (classes = MissionVissionMottoStyles.picture){ src = imagepath}
                }

                div(classes = MissionVissionMottoStyles.schoolmission) {
                    span { +missiontitle }
                }

                div(classes = MissionVissionMottoStyles.paragraph) {
                    p { +words }
                }
            }

        }
    }
}