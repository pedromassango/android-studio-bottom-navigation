package com.inokri.myapplication33

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // handle the bottom navigation item click
        navigation_view.setOnNavigationItemSelectedListener { item ->

            var message = ""

            when(item.itemId){
                R.id.action_home -> message = "Home"
                R.id.action_notifications -> message = "Notifications"
                R.id.action_settings -> message = "Settings"
            }

            // show a message
            Toast.makeText(this@MainActivity,
                    "$message clicked!",
                    Toast.LENGTH_SHORT
            ).show()

            return@setOnNavigationItemSelectedListener true
        }
    }
}
