package com.geovane.navigationcomponent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController

class fivefragment : Fragment(R.layout.fragment_fivefragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.fivebutton).setOnClickListener {
            findNavController().navigate(R.id.fourfragmentToFiveFragment)
        }
    }
}