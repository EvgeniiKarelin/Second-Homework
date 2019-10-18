package com.example.bonch.dev.school

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class FirstActivity : AppCompatActivity() {

    private lateinit var counterButton: Button
    private lateinit var textField: EditText
    private lateinit var indicatorButton: Button
    private lateinit var nextActivityButton: Button

    private  val counter = Counter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        counterButton = findViewById(R.id.counter_button)
        textField = findViewById(R.id.text_field)
        indicatorButton = findViewById(R.id.indicator_button)
        nextActivityButton = findViewById(R.id.next_activity_button)


        counterButton.setOnClickListener(View.OnClickListener {
            counter.increment()
            counterButton.setText("${counter.currentCounter} taps")
        })

        indicatorButton.setOnClickListener(View.OnClickListener {
            indicatorButton.isEnabled=false
        })

        nextActivityButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@FirstActivity, SecondActivity::class.java)
            intent.putExtra("COUNTER", counter.currentCounter)
            intent.putExtra("isENABLED", indicatorButton.isEnabled)
            intent.putExtra("TEXT", textField.text.toString())

            startActivity(intent)
        })
    }


}
