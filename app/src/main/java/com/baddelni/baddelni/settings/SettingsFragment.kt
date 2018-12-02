package com.baddelni.baddelni.settings

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baddelni.baddelni.R
import com.baddelni.baddelni.loginRegister.LoginRegisterActivity
import com.baddelni.baddelni.packageSection.BuyPackageActivity
import kotlinx.android.synthetic.main.fragment_settings.*


class SettingsFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buyPosts.setOnClickListener { startActivity(Intent(context!!, BuyPackageActivity::class.java)) }

        logoutBt.setOnClickListener {
            val intent = Intent(context!!, LoginRegisterActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }
}