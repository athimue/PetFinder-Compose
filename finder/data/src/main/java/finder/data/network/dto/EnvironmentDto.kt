package finder.data.network.dto

import com.mathieu.finder.domain.model.Environment

data class EnvironmentDto(
  val children: Boolean,
  val dogs: Boolean,
  val cats: Boolean
) {
  fun toEnvironment() = Environment(
    children = children,
    dogs = dogs,
    cats = cats
  )
}
