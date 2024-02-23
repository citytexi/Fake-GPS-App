package com.citytexi.fakegps.naviagtion

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.citytexi.fakegps.feature.onboarding.navigation.ON_BOARDING_NAVIGATION_ROUTE
import com.citytexi.fakegps.feature.onboarding.navigation.onBoardingScreen
import com.citytexi.fakegps.ui.FakeGpsAppState

@Composable
fun FakeGpsNavHost(
    modifier: Modifier = Modifier,
    appState: FakeGpsAppState,
    onShowSnackBar: suspend (String) -> Boolean,
) {
    val navController = appState.navController

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = ON_BOARDING_NAVIGATION_ROUTE,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None },
        popEnterTransition = { EnterTransition.None },
        popExitTransition = { ExitTransition.None }
    ) {
        onBoardingScreen(
            navigateToHome = { _ -> }
        )
    }

}