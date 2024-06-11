package com.mathieu.finder.domain.model

data class Address(
  val address1: String?,
  val address2: String?,
  val city: String,
  val state: String,
  val postcode: String,
  val country: String
)
