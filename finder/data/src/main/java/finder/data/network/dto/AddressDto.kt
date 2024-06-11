package finder.data.network.dto

import com.mathieu.finder.domain.model.Address

data class AddressDto(
  val address1: String?,
  val address2: String?,
  val city: String,
  val state: String,
  val postcode: String,
  val country: String
) {
  fun toAddress() = Address(
    address1 = address1,
    address2 = address2,
    city = city,
    state = state,
    postcode = postcode,
    country = country
  )
}
