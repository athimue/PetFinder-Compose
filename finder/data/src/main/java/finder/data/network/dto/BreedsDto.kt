package finder.data.network.dto

data class BreedsDto(
  val primary: String,
  val secondary: String?,
  val mixed: Boolean,
  val unknown: Boolean
)
