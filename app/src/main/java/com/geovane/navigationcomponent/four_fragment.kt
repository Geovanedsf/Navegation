package com.geovane.navigationcomponent


import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FourFragment : Fragment(R.layout.fragment_four_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.fourbutton).setOnClickListener {
            findNavController().navigate(R.id.actionThirdFragmentToFourFragment)
        }
    }
}