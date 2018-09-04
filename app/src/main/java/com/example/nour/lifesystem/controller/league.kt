package com.example.nour.lifesystem.controller
import android.content.Intent
import android.media.AsyncPlayer
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.nour.lifesystem.R
import com.example.nour.lifesystem.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*
class league : BaseActivity() {
    var player = com.example.nour.lifesystem.model.player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMenClick(view: View) {
        womenleaguebtn.isChecked = false
        coedleaguebtn.isChecked = false
        player.league = "men"
    }

    fun onWomenClick(view: View) {
        menleaguebtn.isChecked = false
        coedleaguebtn.isChecked = false
        player.league = "women"
    }

    fun onCo_EdClick(view: View) {
        menleaguebtn.isChecked = false
        womenleaguebtn.isChecked = false
        player.league = "co-ed"
    }

    fun leagueNextCilcked(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, skillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        } else{
            Toast.makeText(this, "please select a league.",Toast.LENGTH_SHORT).show() }
    }
}