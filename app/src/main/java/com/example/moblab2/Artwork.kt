package com.example.moblab2

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Artwork(
    @StringRes val titleResId: Int,
    val year: String,
    @StringRes val authorResId: Int,
    @DrawableRes val imageResId: Int
)