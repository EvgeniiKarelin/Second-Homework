package com.example.bonch.dev.school

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class MyFragment(val counterValue:Int, val isEnabel: Boolean, val text: String) : Fragment() {

    private  lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.my_fragment,container,false)
        textView = view.findViewById(R.id.textResult)
        textView.text="кликов:${counterValue}\nактивность кнопки:${isEnabel}\nвведенная строка:${text}"
        return view
    }
}
