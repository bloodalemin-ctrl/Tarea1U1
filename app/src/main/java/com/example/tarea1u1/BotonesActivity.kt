package com.example.tarea1u1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class BotonesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botones)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)


        val titulos = listOf("Normal", "Alerta", "Envío", "Registro", "Salida")
        for (t in titulos) {
            tabLayout.addTab(tabLayout.newTab().setText(t))
        }

        cambiarFragmento(FragBoton1())

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val fragmento = when (tab?.position) {
                    0 -> FragBoton1()
                    1 -> FragBoton2()
                    2 -> FragBoton3()
                    3 -> FragBoton4()
                    else -> FragBoton5()
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