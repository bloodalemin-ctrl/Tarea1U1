package com.example.tarea1u1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class InformacionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        val titulos = listOf("Perfil", "Ajustes", "Ayuda", "Info", "Mapa")
        for (t in titulos) {
            tabLayout.addTab(tabLayout.newTab().setText(t))
        }


        cambiarFragmento(FragInfo1())

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val fragmento = when (tab?.position) {
                    0 -> FragInfo1()
                    1 -> FragInfo2()
                    2 -> FragInfo3()
                    3 -> FragInfo4()
                    else -> FragInfo5()
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