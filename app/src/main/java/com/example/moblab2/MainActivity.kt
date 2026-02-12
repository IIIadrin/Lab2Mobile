package com.example.moblab2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var currentIndex = 0

    private lateinit var imageView: ImageView
    private lateinit var titleText: TextView
    private lateinit var authorYearText: TextView
    private lateinit var prevButton: Button
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.image_view)
        titleText = findViewById(R.id.title_text)
        authorYearText = findViewById(R.id.author_year_text)
        prevButton = findViewById(R.id.prev_button)
        nextButton = findViewById(R.id.next_button)

        if (savedInstanceState != null) {
            currentIndex = savedInstanceState.getInt("current_index", 0)
        }

        updateUI()

        prevButton.setOnClickListener {
            if (currentIndex > 0) {
                currentIndex--
                updateUI()
            }
        }

        nextButton.setOnClickListener {
            if (currentIndex < ArtCollection.artworks.size - 1) {
                currentIndex++
                updateUI()
            }
        }
    }

    private fun updateUI() {
        val artwork = ArtCollection.artworks[currentIndex]
        imageView.setImageResource(artwork.imageResId)
        val title = getString(artwork.titleResId)
        val author = getString(artwork.authorResId)
        titleText.text = title
        authorYearText.text = "$author, ${artwork.year}"
        imageView.contentDescription = getString(R.string.image_desc_format, title, author)

        prevButton.isEnabled = currentIndex > 0
        nextButton.isEnabled = currentIndex < ArtCollection.artworks.size - 1
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("current_index", currentIndex)
    }
}