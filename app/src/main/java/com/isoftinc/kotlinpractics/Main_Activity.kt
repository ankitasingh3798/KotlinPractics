package com.isoftinc.kotlinpractics

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Main_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mainscreen)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        val bottombar=findViewById<BottomNavigationView>(R.id.bottom_bar);

        bottombar.setOnItemSelectedListener {menuItem->

            if(menuItem.itemId==R.id.nav_gaurd){
                inflateFragment(GaurdFragment.newInstance())

            }else if(menuItem.itemId==R.id.nav_home){
                inflateFragment(Home_Fragment.newInstance())
            }

            true
        }
    }



    private fun inflateFragment(newInstance: Fragment) {

        var transcation=supportFragmentManager.beginTransaction()
        transcation.replace(R.id.container,newInstance)
        transcation.commit()
    }
}