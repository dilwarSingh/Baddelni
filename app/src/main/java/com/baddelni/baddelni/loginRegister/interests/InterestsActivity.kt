package com.baddelni.baddelni.loginRegister.interests

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.baddelni.baddelni.R
import kotlinx.android.synthetic.main.activity_interests.*

class InterestsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interests)

        val adapterInterests = AdapterInterests(genrateNames(), this)
        interestRecycler.adapter = adapterInterests


    }

    private fun genrateNames(): MutableList<String> {
        val list: MutableList<String> = emptyList<String>().toMutableList()
        for (i in 0 until 9) {
            list.add("Name $i")
        }
        return list
    }
}