package com.baddelni.loginRegister

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.baddelni.R
import kotlinx.android.synthetic.main.activity_login_register.*

class LoginRegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_register)

        changeContainerFragment(LoginFragment())

    }

    fun changeContainerFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(frameContainer.id, fragment).commit()
    }
}
