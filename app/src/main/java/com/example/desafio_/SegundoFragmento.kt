package com.example.desafio_

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class SegundoFragmento : Fragment(R.layout.segundo_fragmento) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = view.findViewById<EditText>(R.id.editTextNome)

            view.findViewById<Button>(R.id.buttonEnviar).setOnClickListener {
            val action = SegundoFragmentoDirections.actionTela2ParaTela3(
                "${data.text}")

            view.findViewById<TextView>(R.id.imageButtonvoltar).setOnClickListener {
                findNavController().navigate(R.id.actionTela2ParaTela1)

                findNavController().navigate(action)
                

                /* view.findViewById<Button>(R.id.button2).setOnClickListener {
            findNavController().navigate(R.id.actiontela2paratela3)
        }

        view.findViewById<ImageButton>(R.id.imageButtonvoltar).setOnClickListener {
            findNavController().navigate(R.id.actiontela2paratela1)
        }

        val nomerecebido: EditText? = view.findViewById(R.id.edittextnome)

        val acao = segundofragmentoDirections.actiontela2paratela3(
            nome = "$nomerecebido"
        )
        view.findViewById<Button>(R.id.button2).setOnClickListener {
            findNavController().navigate(acao)*/
            }
        }
    }
}






