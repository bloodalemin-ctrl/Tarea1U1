package com.example.tarea1u1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

// Molde especializado para la categoría de BOTONES
open class FragmentBotonBase(
    private val titulo: String,
    private val descripcion: String,
    private val textoBoton: String
) : Fragment(R.layout.fragment_base) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 1. Seteamos los textos en la plantilla fragment_base.xml
        view.findViewById<TextView>(R.id.txtTitulo).text = titulo
        view.findViewById<TextView>(R.id.txtDesc).text = descripcion

        // 2. Buscamos el contenedor donde meteremos el botón
        val contenedor = view.findViewById<FrameLayout>(R.id.contenedorDemo)

        // 3. Creamos el botón por código (Dinámico)
        val btn = Button(requireContext()).apply {
            text = textoBoton
            // Color morado ESCOM/Android estándar
            setBackgroundColor(android.graphics.Color.parseColor("#6200EE"))
            setTextColor(android.graphics.Color.WHITE)

            setOnClickListener {
                Toast.makeText(context, "Presionaste: $textoBoton", Toast.LENGTH_SHORT).show()
            }
        }

        // 4. Limpiamos y agregamos al FrameLayout
        contenedor.removeAllViews()
        contenedor.addView(btn)
    }
}