package com.baddelni.baddelni

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.baddelni.baddelni.account.accountHome
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_bottom_navigation.view.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initBottomNavigationView()

    }

    private fun initBottomNavigationView() {

        homeBt.setOnClickListener {
            makeAllUnActive()
            makeActive(it)
            setContentFragment(accountHome())
        }
        accountBt.setOnClickListener {
            makeAllUnActive()
            makeActive(it)
        }
        notificationBt.setOnClickListener {
            makeAllUnActive()
            makeActive(it)
        }
        settingsBt.setOnClickListener {
            makeAllUnActive()
            makeActive(it)
        }
        categoryBt.setOnClickListener {
            makeAllUnActive()
            makeActive(it)
        }


    }

    private fun makeActive(view: View) {
        view.title.setTextColor(resources.getColor(R.color.gradient2))
    }

    private fun makeAllUnActive() {

        homeBt.title.setTextColor(resources.getColor(R.color.greyText))
        accountBt.title.setTextColor(resources.getColor(R.color.greyText))
        notificationBt.title.setTextColor(resources.getColor(R.color.greyText))
        settingsBt.title.setTextColor(resources.getColor(R.color.greyText))
        categoryBt.title.setTextColor(resources.getColor(R.color.greyText))

    }

    private fun setContentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(frameLayout.id, fragment).commit()
    }

}
