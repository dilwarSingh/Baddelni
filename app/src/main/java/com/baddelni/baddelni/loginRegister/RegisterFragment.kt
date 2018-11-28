package com.baddelni.baddelni.loginRegister

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.baddelni.baddelni.R
import kotlinx.android.synthetic.main.fragment_register.*

class RegisterFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loginText.setOnClickListener { (context as LoginRegisterActivity).changeContainerFragment(LoginFragment()) }
        backBt.setOnClickListener { (context as LoginRegisterActivity).changeContainerFragment(EmailFragment()) }

        male.setOnClickListener { male.isChecked = true; female.isChecked = false; }
        female.setOnClickListener { female.isChecked = true; male.isChecked = false; }
    }


}
