package com.example.moblab2

object ArtCollection {

    val artworks: List<Artwork> = listOf(
        Artwork(
            titleResId = R.string.winter_morning_title,
            year = "1907",
            authorResId = R.string.grabar_name,
            imageResId = R.drawable.winter_morning
        ),
        Artwork(
            titleResId = R.string.hoarfrost_title,
            year = "1905",
            authorResId = R.string.grabar_name,
            imageResId = R.drawable.hoarfrost
        ),
        Artwork(
            titleResId = R.string.march_snow_title,
            year = "1904",
            authorResId = R.string.grabar_name,
            imageResId = R.drawable.march_snow
        ),
        Artwork(
            titleResId = R.string.february_azure_title,
            year = "1904",
            authorResId = R.string.grabar_name,
            imageResId = R.drawable.february_azure
        ),
        Artwork(
            titleResId = R.string.white_winter_title,
            year = "1903",
            authorResId = R.string.grabar_name,
            imageResId = R.drawable.white_winter
        )
    )
}