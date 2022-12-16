package com.geovane.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.secondbutton).setOnClickListener {
            findNavController().navigate(R.id.actionSecondToFirst)
        }
        view.findViewById<Button>(R.id.buttonthird).setOnClickListener {
            findNavController().navigate(R.id.actionSecondToThird)

        }
    }
}