package com.baddelni.baddelni.account

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.baddelni.baddelni.R
import com.baddelni.baddelni.packageSection.CreatePostActivity
import kotlinx.android.synthetic.main.layout_top_view.view.*
import kotlinx.android.synthetic.main.request_activity.*

class RequestsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.request_activity)

        recycler.adapter = AdapterRequests(this)
        include.newPostBt.setOnClickListener { startActivity(Intent(this, CreatePostActivity::class.java)) }
        backBt.setOnClickListener { finish() }

    }
}