package finder.data.network.dto

import com.mathieu.finder.domain.model.Link

data class LinkDto(
  val href: String
) {
  fun toLink() = Link(
    href = href
  )
}
