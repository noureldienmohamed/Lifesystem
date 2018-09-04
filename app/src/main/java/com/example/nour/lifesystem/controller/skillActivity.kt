package com.example.nour.lifesystem.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.nour.lifesystem.R
import com.example.nour.lifesystem.model.player
import com.example.nour.lifesystem.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class skillActivity : AppCompatActivity() {
     lateinit var player : player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
     player = intent.getParcelableExtra(EXTRA_PLAYER)

    }
    fun onskillbeginnerclick(view: View) {
        ballerskillbtn.isChecked = false
        player.skill = "beginnerskillbtn"
    }
    fun onskillballerclick(view: View) {
        beginnerskillbtn.isChecked = false
        player.skill= "baller"
    }
    fun onskillfinishclick (view: View){
    if (player.skill !=""){
        val finishActivity = Intent(this, FinishActivity ::class.java)
        finishActivity.putExtra(EXTRA_PLAYER,player)
        startActivity(finishActivity)
    }else {
        Toast.makeText(this,"please select a skill level",Toast.LENGTH_SHORT).show( )
    }
    }
}
