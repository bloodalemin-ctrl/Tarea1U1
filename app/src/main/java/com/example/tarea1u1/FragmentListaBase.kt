package com.example.tarea1u1

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.FrameLayout
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment

open class FragmentListaBase(
    private val titulo: String,
    private val descripcion: String,
    private val elementos: List<String>
) : Fragment(R.layout.fragment_base) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.txtTitulo).text = titulo
        view.findViewById<TextView>(R.id.txtDesc).text = descripcion

        val contenedor = view.findViewById<FrameLayout>(R.id.contenedorDemo)

        // Creamos la lista dinámicamente
        val listView = ListView(requireContext())
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, elementos)
        listView.adapter = adapter

        contenedor.removeAllViews()
        contenedor.addView(listView)
    }
}