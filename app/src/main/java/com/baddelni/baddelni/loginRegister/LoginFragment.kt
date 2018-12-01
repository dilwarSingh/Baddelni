package com.baddelni.baddelni.loginRegister

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baddelni.baddelni.MainActivity

import com.baddelni.baddelni.R
import com.baddelni.baddelni.loginRegister.interests.InterestsActivity
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        emailCard.setOnClickListener { (context as LoginRegisterActivity).changeContainerFragment(EmailFragment()) }


        googleCard.setOnClickListener { context?.startActivity(Intent(context, InterestsActivity::class.java)) }
        fbCard.setOnClickListener { context?.startActivity(Intent(context, MainActivity::class.java)) }
    }
}
