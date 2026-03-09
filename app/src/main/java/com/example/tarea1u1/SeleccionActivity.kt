package com.example.tarea1u1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class SeleccionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)


        val titulos = listOf("Términos", "Notis", "Privacidad", "GPS", "Seguridad")
        for (t in titulos) { tabLayout.addTab(tabLayout.newTab().setText(t)) }

        // 2. Fragmento inicial
        cambiarFragmento(FragSeleccion1())

        // 3. lista de vcambios entre fargmnets
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val f = when(tab?.position) {
                    0 -> FragSeleccion1()
                    1 -> FragSeleccion2()
                    2 -> FragSeleccion3()
                    3 -> FragSeleccion4()
                    else -> FragSeleccion5()
                }
                cambiarFragmento(f)
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