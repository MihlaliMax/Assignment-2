package com.example.imadassignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Find the clickMeButton in the layout
        val clickMeButton: Button = findViewById(R.id.clickMeButton)

        // Set a click listener on the button
        clickMeButton.setOnClickListener {
            // Create an intent to launch MainActivity2
            val intent = Intent(this, MainActivity2::class.java)

            // Start the activity
            startActivity(intent)


        }

    }
}