package com.example.bonch.dev.school

import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class FragmentActivity : AppCompatActivity() {

    val fm = supportFragmentManager
    private lateinit var attachFragmentButton: Button
    private lateinit var counterButton: Button
    private lateinit var textField: EditText
    private lateinit var indicatorButton: Button
    private lateinit var nextActivityButton: Button

    private  val counter = Counter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        indicatorButton = findViewById(R.id.indicator_button)
        counterButton = findViewById(R.id.counter_button)
        textField = findViewById(R.id.text_field)
        nextActivityButton = findViewById(R.id.next_activity_button)
        attachFragmentButton = findViewById(R.id.attach_fragment_button)


        counterButton.setOnClickListener(View.OnClickListener {
            counter.increment()
            counterButton.setText("${counter.currentCounter} taps")
        })

        indicatorButton.setOnClickListener(View.OnClickListener {
            indicatorButton.isEnabled=false
        })

        attachFragmentButton.setOnClickListener(View.OnClickListener {
            val count = counter.currentCounter
            val isEnabel = indicatorButton.isEnabled
            val text = textField.text.toString()
            val myFragment = MyFragment(count, isEnabel, text)
            fm.beginTransaction().add(R.id.fragment_container, myFragment).commit()
        })
    }

    fun replaseFragment(){

        val fragment = SecondFragment()
        fm.beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack("first_fragment").commit()
    }

}
