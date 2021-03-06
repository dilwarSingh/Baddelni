package com.baddelni.baddelni.loginRegister


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.baddelni.baddelni.R
import com.baddelni.baddelni.loginRegister.interests.InterestsActivity
import kotlinx.android.synthetic.main.fragment_email.*


class EmailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_email, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        signUpText.setOnClickListener { (context as LoginRegisterActivity).changeContainerFragment(RegisterFragment()) }
        signinBt.setOnClickListener { context?.startActivity(Intent(context, InterestsActivity::class.java)) }
    }


}
