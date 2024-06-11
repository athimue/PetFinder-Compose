package finder.data.network.dto

data class PaginationDto(
  val countPerPage: Int,
  val totalCount: Int,
  val currentPage: Int,
  val totalPages: Int,
  val links: Map<String, Any>
)
