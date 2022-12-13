package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

        //Default View
        rollDice()
    }

    private fun rollDice() {
        //Update Dice Roll Result on screen
        val result: ImageView = findViewById(R.id.imageView)
        result.setImageDrawable(Dice(6, resources).roll())
    }
}