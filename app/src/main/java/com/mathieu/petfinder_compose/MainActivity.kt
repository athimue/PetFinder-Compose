package com.mathieu.petfinder_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mathieu.petfinder_compose.navigation.MainNavigation
import com.mathieu.petfinder_compose.ui.theme.PetFinderComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      PetFinderComposeTheme {
        MainNavigation()
      }
    }
  }
}