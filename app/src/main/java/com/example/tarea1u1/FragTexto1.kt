package com.example.tarea1u1

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import android.widget.Button

class FragTexto1 : Fragment(R.layout.fragment_base) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.txtTitulo).text = "Campo de Texto Simple"
        view.findViewById<TextView>(R.id.txtDesc).text = "Permite al usuario ingresar cualquier tipo de texto alfanumérico."

        val contenedor = view.findViewById<FrameLayout>(R.id.contenedorDemo)

        // Creamos el EditText por código para que sea más rápido
        val input = EditText(context).apply {
            hint = "Escribe tu nombre aquí"
        }
        contenedor.addView(input)
    }
}