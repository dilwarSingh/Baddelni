package com.baddelni.baddelni.account

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.baddelni.baddelni.R
import kotlinx.android.synthetic.main.activity_tips.*

class TipsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_tips)



        acceptBt.setOnClickListener {
            congoGroup.visibility = View.VISIBLE
            Handler().postDelayed({
                runOnUiThread {
                    finish()
                    //congoGroup.visibility = GONE
                }
            }, 2000)

        }
    }
}