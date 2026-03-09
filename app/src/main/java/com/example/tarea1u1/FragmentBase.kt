package com.example.tarea1u1

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.Fragment

// Clase base para no repetir código en los 5 fragmentos de texto
open class FragmentBase(
    private val titulo: String,
    private val descripcion: String,
    private val tipoInput: Int
) : Fragment(R.layout.fragment_base) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Seteamos los textos que vienen de cada hijo
        view.findViewById<TextView>(R.id.txtTitulo).text = titulo
        view.findViewById<TextView>(R.id.txtDesc).text = descripcion

        // Creamos el cuadro de texto dinámicamente
        val contenedor = view.findViewById<FrameLayout>(R.id.contenedorDemo)
        val input = EditText(requireContext()).apply {
            hint = "Escribe aquí..."
            inputType = tipoInput
        }

        contenedor.removeAllViews()
        contenedor.addView(input)
    }
}