package com.baddelni.baddelni.account


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.baddelni.baddelni.R
import com.baddelni.baddelni.notifications.AdapterNotifications
import kotlinx.android.synthetic.main.fragment_notifications.*
import kotlinx.android.synthetic.main.layout_top_view.view.*


class FavoritesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_notifications)

        include.newPostText.text = getString(R.string.newPost)
        include.text.text = getString(R.string.favorites)
        backBt.setOnClickListener { finish() }
        Title.text = "Favorites"
        recycler.adapter = AdapterNotifications(this)
    }
}