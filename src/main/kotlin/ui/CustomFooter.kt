package ui

import kotlinx.css.LinearDimension
import kotlinx.css.TextAlign
import kotlinx.css.color
import kotlinx.css.marginBottom
import kotlinx.css.marginTop
import kotlinx.css.textAlign
import kotlinx.css.width
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.styledFooter
import ui.external.materialui.Color
import ui.external.materialui.TypographyVariant
import ui.external.materialui.link
import ui.external.materialui.typography

class CustomFooter : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        styledFooter {
            css {
                width = LinearDimension("100%")
                textAlign = TextAlign.center
                color = kotlinx.css.Color.grey
                marginBottom = LinearDimension("15px")
                marginTop = LinearDimension("5px")
            }
            typography {
                attrs {
                    variant = TypographyVariant.body2
                    color = Color.inherit
                }
                +"UtaFormatix © 2015 - 2020  |  "
                link {
                    attrs {
                        href = "https://github.com/sdercolin/utaformatix3"
                        target = "_blank"
                        color = Color.inherit
                    }
                    +"Join Us"
                }
            }
        }
    }
}
