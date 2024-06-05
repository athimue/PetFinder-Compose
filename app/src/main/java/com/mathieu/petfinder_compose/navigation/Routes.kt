package com.mathieu.petfinder_compose.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {

  @Serializable
  object Finder
}