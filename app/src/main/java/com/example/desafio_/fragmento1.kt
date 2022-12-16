package com.example.desafio_

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class fragmento1 : Fragment (R.layout.fragmento1){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button).setOnClickListener{
            findNavController().navigate(R.id.actiontela1paratela2)
        }
    }
}

