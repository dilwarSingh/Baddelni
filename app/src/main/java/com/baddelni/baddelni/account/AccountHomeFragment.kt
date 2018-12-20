package com.baddelni.baddelni.account

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baddelni.baddelni.R
import com.baddelni.baddelni.packageSection.BuyPackageActivity
import com.baddelni.baddelni.packageSection.CreatePostActivity
import kotlinx.android.synthetic.main.fragment_account.*
import kotlinx.android.synthetic.main.layout_account.view.*

class AccountHomeFragment : Fragment() {

    lateinit var activity: AppCompatActivity

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        activity = context as AppCompatActivity

        recycler.adapter = AdapterAccountHome(activity)

        profileSection.accountBt.setOnClickListener { startActivity(Intent(activity, EditProfileActivity::class.java)) }
        profileSection.requestLL.setOnClickListener { startActivity(Intent(activity, RequestsActivity::class.java)) }
        profileSection.newRequestBt.setOnClickListener { startActivity(Intent(activity, RequestsActivity::class.java)) }
        profileSection.avaliablePostLL.setOnClickListener { startActivity(Intent(activity, BuyPackageActivity::class.java)) }
        profileSection.likesLL.setOnClickListener { startActivity(Intent(activity, FavoritesActivity::class.java)) }
        newPostBt.setOnClickListener { startActivity(Intent(activity, CreatePostActivity::class.java)) }

    }
}
