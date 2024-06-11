package finder.data.network.dto

import com.mathieu.finder.domain.model.Attributes

data class AttributesDto(
  val spayedNeutered: Boolean,
  val houseTrained: Boolean,
  val declawed: Boolean,
  val specialNeeds: Boolean,
  val shotsCurrent: Boolean
) {
  fun toAttributes() = Attributes(
    spayedNeutered = spayedNeutered,
    houseTrained = houseTrained,
    declawed = declawed,
    specialNeeds = specialNeeds,
    shotsCurrent = shotsCurrent
  )
}