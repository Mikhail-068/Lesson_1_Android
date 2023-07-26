package com.example.lesson_1_lite

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random



class MainActivity : AppCompatActivity() {

    private lateinit var numberTextView: TextView
    private lateinit var generateButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberTextView = findViewById(R.id.numberTextView)
        generateButton = findViewById(R.id.generateButton)

        generateButton.setOnClickListener {
            val randomNumber = generateRandomNumber()
            numberTextView.text = randomNumber.toString()
        }
    }

    private fun generateRandomNumber(): Int {
        return Random.nextInt(1, 101)
    }
}
