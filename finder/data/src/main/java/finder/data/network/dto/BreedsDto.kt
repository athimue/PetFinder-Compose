package finder.data.network.dto

import com.mathieu.finder.domain.model.Breeds

data class BreedsDto(
  val primary: String,
  val secondary: String?,
  val mixed: Boolean,
  val unknown: Boolean
) {
  fun toBreeds() = Breeds(
    primary,
    secondary,
    mixed,
    unknown
  )
}
