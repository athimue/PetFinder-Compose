package com.mathieu.finder.domain.model

data class Breeds(
  val primary: String,
  val secondary: String?,
  val mixed: Boolean,
  val unknown: Boolean
)
