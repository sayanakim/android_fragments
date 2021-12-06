package com.sayana.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationMenu = findViewById(R.id.bottom_navigation_menu)

        bottomNavigationMenu.setOnItemSelectedListener() { item ->

            var fragment:Fragment? = null

            when(item.itemId) {
                R.id.moscow_item -> {
                    fragment = MoscowFragment()
                }
                R.id.new_york_item -> {
                    fragment = NewYorkFragment()
                }
                R.id.beijing_item -> {
                    fragment = BeijingFragment()
                }
            }

            replaceFragment(fragment!!)

            true

        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(fragment.tag)
            .commit()
    }
}