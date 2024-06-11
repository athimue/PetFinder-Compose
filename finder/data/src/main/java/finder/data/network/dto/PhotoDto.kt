package finder.data.network.dto

import com.mathieu.finder.domain.model.Photo

data class PhotoDto(
val small: String,
val medium: String,
val large: String,
val full: String
) {
  fun toPhoto() = Photo(
    small = small,
    medium = medium,
    large = large,
    full = full
  )
}

