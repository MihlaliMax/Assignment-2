package com.example.imadassignment2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)




        // Get references to the views
        val imageView = findViewById<ImageView>(R.id.imageView)
        val feedButton = findViewById<Button>(R.id.feedButton)
        val cleanButton = findViewById<Button>(R.id.cleanButton)
        val playButton = findViewById<Button>(R.id.playButton)
        val progressBar1 = findViewById<ProgressBar>(R.id.progressBar1)
        val progressBar2 = findViewById<ProgressBar>(R.id.progressBar2)
        val progressBar3 = findViewById<ProgressBar>(R.id.progressBar3)

        // Set onClickListener for feedButton
        feedButton.setOnClickListener {
            // Change the image in imageView to feeding.jpg
            imageView.setImageResource(R.drawable.feeding)
            // Update the progress of progressBar1
            updateProgressBar(progressBar1)
        }

        // Set onClickListener for cleanButton
        cleanButton.setOnClickListener {
            // Change the image in imageView to washing.jpg
            imageView.setImageResource(R.drawable.washing)
            // Update the progress of progressBar2
            updateProgressBar(progressBar2)
        }

        // Set onClickListener for playButton
        playButton.setOnClickListener {
            // Change the image in imageView to play.jpg
            imageView.setImageResource(R.drawable.play)
            // Update the progress of progressBar3
            updateProgressBar(progressBar3)
        }
    }

    private fun updateProgressBar(progressBar: ProgressBar) {
        // Get the current progress of the progress bar
        var progress = progressBar.progress
        // Increment the progress by 10%
        progress += 10
        // Update the progress bar with the new progress value
        progressBar.progress = progress
        // Check if the progress bar is full (100%)
        if (progress >= 100) {
            // Reset the progress to 0 when it reaches 100%
            progressBar.progress = 0
        }
    }
}

