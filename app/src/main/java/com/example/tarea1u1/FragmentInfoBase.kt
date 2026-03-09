package com.example.tarea1u1

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.Fragment

open class FragmentInfoBase(
    private val titulo: String,
    private val descripcion: String,
    private val imagenRes: Int
) : Fragment(R.layout.fragment_base) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.txtTitulo).text = titulo
        view.findViewById<TextView>(R.id.txtDesc).text = descripcion

        val contenedor = view.findViewById<FrameLayout>(R.id.contenedorDemo)


        val img = ImageView(requireContext()).apply {
            setImageResource(imagenRes)
            adjustViewBounds = true
        }

        contenedor.removeAllViews()
        contenedor.addView(img)
    }
}