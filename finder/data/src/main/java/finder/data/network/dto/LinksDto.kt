package finder.data.network.dto

import com.mathieu.finder.domain.model.Links

data class LinksDto(
  val self: LinkDto,
  val type: LinkDto,
  val organization: LinkDto
) {
  fun toLinks() = Links(
    self = self.toLink(),
    type = type.toLink(),
    organization = organization.toLink()
  )
}
