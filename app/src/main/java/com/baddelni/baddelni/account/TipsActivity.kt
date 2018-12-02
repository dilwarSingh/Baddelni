package com.baddelni.baddelni.account

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.View.GONE
import com.baddelni.baddelni.R
import kotlinx.android.synthetic.main.activity_tips.*

class TipsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_tips)


        Handler().postDelayed({
            runOnUiThread { congoGroup.visibility = GONE }
        }, 2000)

        acceptBt.setOnClickListener { finish() }
    }
}