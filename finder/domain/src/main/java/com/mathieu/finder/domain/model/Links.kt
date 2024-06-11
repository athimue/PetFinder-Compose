package com.mathieu.finder.domain.model

data class Links(
  val self: Link,
  val type: Link,
  val organization: Link
)

data class Link(
  val href: String
)
