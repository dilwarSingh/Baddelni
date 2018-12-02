package com.baddelni.baddelni.account

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.baddelni.baddelni.R
import kotlinx.android.synthetic.main.edit_profile.*

class EditProfileActivity :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.edit_profile)
        backBt.setOnClickListener { finish() }

    }
}