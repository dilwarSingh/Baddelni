package com.baddelni.baddelni

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.baddelni.baddelni.account.AccountHomeFragment
import com.baddelni.baddelni.categories.CategoryFragment
import com.baddelni.baddelni.notifications.NotificationFragment
import com.baddelni.baddelni.settings.SettingsFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_bottom_navigation.view.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initBottomNavigationView()

    }

    private fun initBottomNavigationView() {


        homeBt.title.text = getString(R.string.home)
        accountBt.title.text = getString(R.string.account)
        notificationBt.title.text = getString(R.string.notifications)
        settingsBt.title.text = getString(R.string.settings)
        categoryBt.title.text = getString(R.string.categories)

        homeBt.setOnClickListener {
            makeAllUnActive()
            makeActive(it)
        }
        accountBt.setOnClickListener {
            makeAllUnActive()
            makeActive(it)
            setContentFragment(AccountHomeFragment())

        }
        categoryBt.setOnClickListener {
            makeAllUnActive()
            makeActive(it)
            setContentFragment(CategoryFragment())
        }
        notificationBt.setOnClickListener {
            makeAllUnActive()
            makeActive(it)
            setContentFragment(NotificationFragment())
        }

        settingsBt.setOnClickListener {
            makeAllUnActive()
            makeActive(it)
            setContentFragment(SettingsFragment())
        }

        accountBt.performClick()

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
