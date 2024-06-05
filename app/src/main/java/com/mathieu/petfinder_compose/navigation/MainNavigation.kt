package com.mathieu.petfinder_compose.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mathieu.finder.ui.screen.FinderScreen

@Composable
fun MainNavigation() {
  val navController = rememberNavController()
  Scaffold(
    modifier = Modifier,
    bottomBar = {
      BottomBar(
        currentRoute = navController.currentDestination?.route,
        onFinderClick = { navController.navigate(Routes.Finder) },
      )
    },
  ) {
    NavHost(
      modifier = Modifier.padding(it),
      navController = navController,
      startDestination = Routes.Finder,
    ) {
      composable<Routes.Finder> {
        FinderScreen()
      }
    }
  }
}

@Composable
fun BottomBar(
  currentRoute: String?,
  onFinderClick: () -> Unit,
) {
  NavigationBar {
    NavigationBarItem(
      selected = currentRoute == Routes.Finder.toString(),
      icon = { Icon(imageVector = Icons.Rounded.AccountCircle, contentDescription = null) },
      label = { Text("Finder") },
      onClick = onFinderClick,
      colors = NavigationBarItemDefaults.colors(
        unselectedIconColor = MaterialTheme.colorScheme.secondary,
        unselectedTextColor = MaterialTheme.colorScheme.secondary,
      ),
    )
  }
}
