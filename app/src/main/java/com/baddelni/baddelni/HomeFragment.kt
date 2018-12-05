package com.baddelni.baddelni

import android.content.Intent
import android.graphics.Typeface.BOLD
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baddelni.baddelni.packageSection.CreatePostActivity
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.item_home_quick.view.*
import kotlinx.android.synthetic.main.layout_home_top.view.*

class HomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        quickInclude.title.text = "Quick"

        nearInclude.title.run {
            text = "Top in Your City"
            setTypeface(typeface, BOLD)
        }

        latestInclude.title.run {
            text = "Lasted add"
            setTypeface(typeface, BOLD)
        }
        intrestInclude.title.run {
            text = "Top in Your Interest"
            setTypeface(typeface, BOLD)
        }
        quickFirstView.name.run {
            text = "Create"
            setTextColor(resources.getColor(R.color.gradient2))

        }
        quickFirstView.setOnClickListener { startActivity(Intent(context, CreatePostActivity::class.java)) }
    }
}