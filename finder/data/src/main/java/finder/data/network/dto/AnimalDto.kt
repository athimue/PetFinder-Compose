package finder.data.network.dto

import com.mathieu.finder.domain.model.Animal

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
) {
  fun toAnimal() = Animal(
    id = id,
    organizationId = organizationId,
    url = url,
    type = type,
    species = species,
    breeds = breeds.toBreeds(),
    colors = colors.toColors(),
    age = age,
    gender = gender,
    size = size,
    coat = coat,
    name = name,
    description = description,
    photos = photos.map { it.toPhoto() },
    videos = videos.map { it.toVideo() },
    status = status,
    attributes = attributes.toAttributes(),
    environment = environment.toEnvironment(),
    tags = tags,
    contact = contact.toContact(),
    publishedAt = publishedAt,
    distance = distance,
    links = links.toLinks()
  )
}
