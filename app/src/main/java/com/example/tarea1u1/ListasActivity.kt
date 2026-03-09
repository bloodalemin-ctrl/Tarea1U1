package com.example.tarea1u1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class ListasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listas)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        val titulos = listOf("Frutas", "Colores", "Países", "Lenguajes", "Días")
        for (t in titulos) {
            tabLayout.addTab(tabLayout.newTab().setText(t))
        }

        cambiarFragmento(FragLista1())

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val fragmento = when (tab?.position) {
                    0 -> FragLista1()
                    1 -> FragLista2()
                    2 -> FragLista3()
                    3 -> FragLista4()
                    else -> FragLista5()
                }
                cambiarFragmento(fragmento)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }


    private fun cambiarFragmento(f: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.contenedor_fragments, f)
            .commit()
    }
}