package com.baddelni.baddelni.account

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.baddelni.baddelni.R
import kotlinx.android.synthetic.main.exchange_detail.*

class ExchangeDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exchange_detail)


        declineBt.setOnClickListener { finish() }
        backBt.setOnClickListener { finish() }
        acceptBt.setOnClickListener {
            startActivity(Intent(this, TipsActivity::class.java))
            finish()
        }
    }
}