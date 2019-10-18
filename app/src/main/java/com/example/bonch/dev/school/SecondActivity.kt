package com.example.bonch.dev.school

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textView = findViewById(R.id.text_view)

        val counterValue = intent.getIntExtra("COUNTER", 0)
        val isEnabel = intent.getBooleanExtra("isENABLED", false)
        val text = intent.getStringExtra("TEXT")

        textView.text="колличество кликов:${counterValue.toString()}\nактивность кнопки:${isEnabel}\n" +
                "текст поля:${text}"
    }
}
