package com.example.lesson_1_pro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    private lateinit var submitButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById(R.id.radioGroup)
        submitButton = findViewById(R.id.submitButton)
        resultTextView = findViewById(R.id.resultTextView)

        submitButton.setOnClickListener {
            val selectedRadioButtonId = radioGroup.checkedRadioButtonId
            if (selectedRadioButtonId != -1) {
                val selectedRadioButton = findViewById<RadioButton>(selectedRadioButtonId)
                val selectedText = selectedRadioButton.text
                resultTextView.text = "Выбранный продукт - $selectedText"
            }
        }
    }
}
