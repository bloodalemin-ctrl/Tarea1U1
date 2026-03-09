package com.example.tarea1u1

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

open class FragmentSeleccionBase(
    private val titulo: String,
    private val descripcion: String,
    private val textoOpcion: String
) : Fragment(R.layout.fragment_base) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.txtTitulo).text = titulo
        view.findViewById<TextView>(R.id.txtDesc).text = descripcion

        val contenedor = view.findViewById<FrameLayout>(R.id.contenedorDemo)

        // Creamos un CheckBox dinámico
        val cb = CheckBox(requireContext()).apply {
            text = textoOpcion
            textSize = 18f
            setOnCheckedChangeListener { _, isChecked ->
                val estado = if (isChecked) "Marcado" else "Desmarcado"
                Toast.makeText(context, "$textoOpcion: $estado", Toast.LENGTH_SHORT).show()
            }
        }

        contenedor.removeAllViews()
        contenedor.addView(cb)
    }
}