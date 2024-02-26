package com.citytexi.fakegps.feature.onboarding.route

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavOptions
import com.citytexi.fakegps.feature.onboarding.OnBoardingScreen
import com.citytexi.fakegps.feature.onboarding.OnBoardingViewModel

@Composable
internal fun OnBoardingRoute(
    navigateToHome: (NavOptions) -> Unit,
    viewModel: OnBoardingViewModel = hiltViewModel(),
) {
    OnBoardingScreen {}
}