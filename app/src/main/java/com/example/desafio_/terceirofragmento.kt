package com.example.desafio_

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlin.math.log

class terceirofragmento : Fragment(R.layout.fragment_terceirofragmento){

     private val args : terceirofragmentoArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textViewnome).text = "${args.nome}"

        view.findViewById<TextView>(R.id.textView2).setOnClickListener{
            findNavController().navigate(R.id.actiontela3paratela1)
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

