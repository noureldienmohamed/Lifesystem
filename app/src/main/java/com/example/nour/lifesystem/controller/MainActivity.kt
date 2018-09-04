package com.example.nour.lifesystem.controller

import android.content.Intent
import android.os.Bundle
import com.example.nour.lifesystem.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getstartedbtn.setOnClickListener {
            val leaguIntent = Intent(this, league:: class.java)
            startActivity(leaguIntent)

        }
    }
}
