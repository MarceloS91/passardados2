package com.example.desafio_

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class PrimeiroFragmento : Fragment (R.layout.primeiro_fragmento){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button).setOnClickListener{
            findNavController().navigate(R.id.actionTela1ParaTela2)
        }
    }
}

