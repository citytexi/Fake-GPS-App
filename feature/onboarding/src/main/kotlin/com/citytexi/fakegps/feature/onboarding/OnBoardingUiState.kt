package com.citytexi.fakegps.feature.onboarding

sealed interface OnBoardingUiState {
    data object Loading : OnBoardingUiState
    data object LoadFailed : OnBoardingUiState
    data object Entry : OnBoardingUiState
}