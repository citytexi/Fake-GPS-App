package com.citytexi.fakegps.feature.onboarding

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.citytexi.fakegps.core.design.component.NonScaleText
import com.citytexi.fakegps.core.design.util.DevicePreviews

@Composable
internal fun OnBoardingScreen(
    modifier: Modifier = Modifier,
    onClickStart: () -> Unit
) {

    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        NonScaleText(
            text = stringResource(id = R.string.on_boarding_title),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, start = 24.dp, end = 24.dp),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyMedium,
        )

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 8.dp,
                    bottom = 16.dp,
                    start = 24.dp,
                    end = 24.dp
                ),
            contentPadding = PaddingValues(8.dp),
            onClick = onClickStart,
        ) {
            NonScaleText(
                text = stringResource(id = R.string.on_boarding_start_button_message),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyMedium,
            )
        }
    }
}

@DevicePreviews
@Composable
private fun OnBoardingScreenPreview() {
    OnBoardingScreen {}
}