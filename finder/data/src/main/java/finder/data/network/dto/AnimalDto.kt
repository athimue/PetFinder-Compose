package finder.data.network.dto

data class AnimalDto(
  val id: Int,
  val organizationId: String,
  val url: String,
  val type: String,
  val species: String,
  val breeds: BreedsDto,
  val colors: ColorsDto,
  val age: String,
  val gender: String,
  val size: String,
  val coat: String,
  val name: String,
  val description: String,
  val photos: List<PhotoDto>,
  val videos: List<VideoDto>,
  val status: String,
  val attributes: AttributesDto,
  val environment: EnvironmentDto,
  val tags: List<String>,
  val contact: ContactDto,
  val publishedAt: String,
  val distance: Double,
  val links: LinksDto
)
