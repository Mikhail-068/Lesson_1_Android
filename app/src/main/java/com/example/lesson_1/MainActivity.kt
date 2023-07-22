package com.example.lesson_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.example.lesson_1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(bublic: Bundle?) {
        lateinit var input: EditText // Название животного
        lateinit var header_name: TextView // Заголовок
        lateinit var my_button: Button // Кнопка
        lateinit var photo: ImageView // Изображение



        super.onCreate(bublic)
        setContentView(R.layout.activity_main)

        input = findViewById(R.id.input_1)
        header_name = findViewById(R.id.animal)
        my_button = findViewById(R.id.button_1)
        photo = findViewById(R.id.img_1)

        my_button.setOnClickListener {
            val name_animal = input.text.toString()

            when(name_animal) {
                "собака" -> {
                    header_name.text = name_animal
                    photo.setImageResource(R.drawable.dog)
                }
                "кошка" -> {
                    header_name.text = name_animal
                    photo.setImageResource(R.drawable.cat)
                }
                "попугай" -> {
                    header_name.text = name_animal
                    photo.setImageResource(R.drawable.parrot)
                }
                "хомяк" -> {
                    header_name.text = name_animal
                    photo.setImageResource(R.drawable.humster)
                }
                else -> {
                    header_name.text = "нет такого"
                    photo.setImageResource(R.drawable.android_1)
                }
            }

        }
    }
}