package ru.itprogram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonOne: Button = findViewById(R.id.buttonOne)
        val buttonTwo: Button = findViewById(R.id.buttonTwo)
        val buttonThree: Button = findViewById(R.id.buttonThree)

        buttonOne.setOnClickListener {
            Log.e("buttonOne", buttonOne.text.toString())
        }
        buttonTwo.setOnClickListener {
            Log.e("buttonTwo", buttonTwo.text.toString())
        }
        buttonThree.setOnClickListener {
            Log.e("buttonThree", buttonThree.text.toString())
        }
    }
}