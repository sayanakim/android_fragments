package com.sayana.fragmentactivity

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class StartFragment : Fragment() {

    lateinit var showToastButton: Button



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_start, container, false)
        showToastButton = view.findViewById(R.id.show_toast_button)

        // диалоговое окно при нажатии на кнопку start fragment
        showToastButton.setOnClickListener{
            Toast.makeText(context, "Hello", Toast.LENGTH_LONG).show()
        }
        // some work

        return view
    }

}

// 1. Вынести вьюшку в отдельную переменную
// 2. Совершаем работу вью
// 3. Возвращаем вью




