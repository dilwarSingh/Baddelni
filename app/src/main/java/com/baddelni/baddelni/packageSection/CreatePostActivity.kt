package com.baddelni.baddelni.packageSection

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.baddelni.baddelni.R
import kotlinx.android.synthetic.main.activity_create_post.*
import kotlinx.android.synthetic.main.layout_top_view.view.*

class CreatePostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)

        include.newPostText.text = getString(R.string.buyPost)
        include.newPostBt.setOnClickListener { startActivity(Intent(this, BuyPackageActivity::class.java)) }
    }


}