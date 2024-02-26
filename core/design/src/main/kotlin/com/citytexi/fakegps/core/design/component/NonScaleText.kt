package com.citytexi.fakegps.core.design.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import com.citytexi.fakegps.core.design.util.nonScaleSp

@Composable
fun NonScaleText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontSize: TextUnit,
    fontWeight: FontWeight,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    maxLines: Int = Int.MAX_VALUE,
) = Text(
    text = text,
    modifier = modifier,
    color = color,
    fontSize = fontSize.nonScaleSp,
    fontWeight = fontWeight,
    letterSpacing = letterSpacing.nonScaleSp,
    textAlign = textAlign,
    lineHeight = lineHeight.nonScaleSp,
    textDecoration = textDecoration,
    maxLines = maxLines
)

@Composable
fun NonScaleText(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle,
    textAlign: TextAlign? = null,
    maxLines: Int = Int.MAX_VALUE
) = Text(
    text = text,
    modifier = modifier,
    fontSize = style.fontSize.nonScaleSp,
    fontWeight = style.fontWeight,
    letterSpacing = style.letterSpacing.nonScaleSp,
    textAlign = textAlign,
    lineHeight = style.lineHeight.nonScaleSp,
    textDecoration = style.textDecoration,
    maxLines = maxLines
)

