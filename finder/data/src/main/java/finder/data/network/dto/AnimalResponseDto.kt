package finder.data.network.dto

data class AnimalResponseDto(
  val animals: List<AnimalDto>,
  val pagination: PaginationDto
)