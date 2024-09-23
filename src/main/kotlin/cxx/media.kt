package cxx

import kotlinx.css.LinearDimension
import kotlinx.css.px

fun onlyScreenMinWidth(width: LinearDimension) = "only screen and (min-width: ${width})"

fun onlyScreenMaxWidth(width: LinearDimension) = "only screen and (max-width: ${width})"

object DeviceSize {
    val xs = 575.98.px

    val sm =    576.px

    val smallDevicesMaxWidth = 767.98.px

    val md = 768.px

    val mediumDevicesMaxWidth = 991.98.px

    val lg = 992.px

    val largeDevicesMaxWidth = 1199.98.px

    val xl = 1200.px

    val extraLargeDevicesMaxWidth = 1399.98.px

    val xxl = 1400.px
}

val extraSmallDevices = onlyScreenMaxWidth(DeviceSize.xs) /* Extra Small Devices (phones, less than 576px */

val smallDevices = { "(min-width: ${DeviceSize.sm} and (max-width: ${DeviceSize.smallDevicesMaxWidth})" } /* Example usage: Phones in portrait mode. */

val mediumDevices = { "(min-width: ${DeviceSize.md} and (max-width: ${DeviceSize.mediumDevicesMaxWidth})" } /* Example usage: Phones in landscape mode. */

val largeDevices = { "(min-width: ${DeviceSize.lg} and (max-width: ${DeviceSize.largeDevicesMaxWidth})" } /* Example usage: Tablets in portrait mode. */

val extraLargeDevices = { "(min-width: ${DeviceSize.xl} and (max-width: ${DeviceSize.extraLargeDevicesMaxWidth})" } /* Example usage: Small laptops and larger tablets in landscape mode. */

val xxLargeDevices = onlyScreenMinWidth(DeviceSize.xxl) /* Example usage: Extra large desktop monitors. */


