package com.citytexi.fakegps.feature.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.citytexi.fakegps.core.design.util.DevicePreviews

@Composable
internal fun OnBoardingScreen(
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
    ) {

    }
}

@DevicePreviews
@Composable
private fun OnBoardingScreenPreview() {
    OnBoardingScreen()
}