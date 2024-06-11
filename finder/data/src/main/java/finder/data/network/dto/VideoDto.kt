package finder.data.network.dto

import com.mathieu.finder.domain.model.Video

data class VideoDto(
  val embed: String
) {
  fun toVideo() = Video(
    embed = embed
  )
}
