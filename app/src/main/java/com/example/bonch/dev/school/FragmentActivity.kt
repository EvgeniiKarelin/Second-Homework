package com.example.bonch.dev.school

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FragmentActivity : AppCompatActivity() {

    val fm = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val firstFragment = FirstFragment()

        fm.beginTransaction().add(R.id.fragment1, firstFragment).commit()
    }

    fun replaseFragment(){
        val fragment = SecondFragment()
        fm.beginTransaction().replace(R.id.fragment1,fragment).addToBackStack("first_fragment").commit()
    }

}
