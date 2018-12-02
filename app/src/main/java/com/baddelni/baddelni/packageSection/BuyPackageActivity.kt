package com.baddelni.baddelni.packageSection

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.baddelni.baddelni.R
import kotlinx.android.synthetic.main.activity_buy_package.*

class BuyPackageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_package)

        backBt.setOnClickListener { finish() }

    }

}