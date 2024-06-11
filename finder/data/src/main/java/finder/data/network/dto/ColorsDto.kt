package finder.data.network.dto

import com.mathieu.finder.domain.model.Colors

data class ColorsDto(
  val primary: String,
  val secondary: String?,
  val tertiary: String?
) {
  fun toColors() = Colors(
    primary = primary,
    secondary = secondary,
    tertiary = tertiary
  )
}
