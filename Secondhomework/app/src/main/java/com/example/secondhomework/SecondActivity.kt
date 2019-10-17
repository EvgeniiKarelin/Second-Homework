package com.example.secondhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_first.*

class SecondActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        textView = findViewById(R.id.text_view)

        val counterValue = intent.getIntExtra("COUNTER", 0)
        val indicatorValue = intent.getBooleanExtra("INDICATOR", false)
        val userText = intent.getStringExtra("TEXT")

        textView.text = ("Количество нажатий ${counterValue}\nИндикатор ${indicatorValue}\nВаш текст:${userText}")
    }
}
