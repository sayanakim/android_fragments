package com.sayana.menunavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationMenu:BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationMenu = findViewById(R.id.bottom_navigation_menu)

        // события на меню
        bottomNavigationMenu.setOnItemSelectedListener { item ->

            var fragment:Fragment? = null

            when(item.itemId) {
                R.id.fragment_1 -> {
                    fragment = FirstFragment()
                }
                R.id.fragment_2 -> {
                    fragment = SecondFragment()
                }
            }
            // !! - гарантия разработчика котлину, что данная переменная fragment не будет null
            replaceFragment(fragment!!)

            true
        }

        // по-умолчанию выходит fragment-1
        bottomNavigationMenu.selectedItemId = R.id.fragment_1
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(fragment.tag)
            .commit()
    }
}
