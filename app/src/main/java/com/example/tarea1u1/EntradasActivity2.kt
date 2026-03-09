package com.example.tarea1u1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class EntradasActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entradas2)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayoutEntradas)

        val nombres = listOf("Texto", "Password", "Email", "Número", "Multilinea")
        nombres.forEach { tabLayout.addTab(tabLayout.newTab().setText(it)) }

        cambiarFragment(FragTexto1())

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val fragmento = when(tab?.position) {
                    0 -> FragTexto1()
                    1 -> FragTexto2()
                    2 -> FragTexto3()
                    3 -> FragTexto4()
                    else -> FragTexto5()
                }
                cambiarFragment(fragmento)
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }

    private fun cambiarFragment(f: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.contenedorEntradas, f).commit()
    }
}