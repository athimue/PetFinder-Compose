package finder.data.network.dto

import com.mathieu.finder.domain.model.Contact

data class ContactDto(
  val email: String,
  val phone: String,
  val address: AddressDto
) {
  fun toContact() = Contact(
    email = email,
    phone = phone,
    address = address.toAddress()
  )
}
