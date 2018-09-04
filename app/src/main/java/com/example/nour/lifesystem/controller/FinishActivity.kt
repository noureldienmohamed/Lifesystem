package com.example.nour.lifesystem.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.nour.lifesystem.R
import com.example.nour.lifesystem.model.player
import com.example.nour.lifesystem.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
    val player = intent.getParcelableExtra<player>(EXTRA_PLAYER)
    serch_leaguesText.text=("look for ${player.league} ${player.skill} league neer you ")
    }
}
