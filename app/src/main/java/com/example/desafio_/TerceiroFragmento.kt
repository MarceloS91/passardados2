package com.example.desafio_

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class TerceiroFragmento : Fragment(R.layout.terceiro_fragmento){

     private val args : TerceiroFragmentoArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textViewNome).text = "${args.nome}"

        view.findViewById<TextView>(R.id.textView2).setOnClickListener{
            findNavController().navigate(R.id.actionTela3ParaTela1)
    }
    /*override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView2).setOnClickListener {
            findNavController().navigate(R.id.actiontela3paratela1)
        }

        val args: terceirofragmentoArgs by navArgs()

        val textView = view.findViewById<TextView>(R.id.textViewnome)
        textView.text = "${args.nome}"*/
    }
}

