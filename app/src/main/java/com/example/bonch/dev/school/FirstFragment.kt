package com.example.bonch.dev.school

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {

    private lateinit var button : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.first_fragment,container,false)

        button = view.findViewById(R.id.next_activity_button)

        button.setOnClickListener(View.OnClickListener {
            (context as FragmentActivity).replaseFragment()
        })
        return view
    }

}
