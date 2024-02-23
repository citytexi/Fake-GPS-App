package com.citytexi.fakegps.feature.onboarding.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.citytexi.fakegps.feature.onboarding.route.OnBoardingRoute

const val ON_BOARDING_NAVIGATION_ROUTE = "on_boarding_route"

fun NavController.navigateToOnBoarding(navOptions: NavOptions? = null) {
    this.navigate(ON_BOARDING_NAVIGATION_ROUTE, navOptions)
}

fun NavGraphBuilder.onBoardingScreen(
    navigateToHome: (NavOptions) -> Unit,
) {
    composable(route = ON_BOARDING_NAVIGATION_ROUTE) {
        OnBoardingRoute(
            navigateToHome = navigateToHome,
        )
    }
}