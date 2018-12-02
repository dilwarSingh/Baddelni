package com.baddelni.baddelni.categories

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.baddelni.baddelni.R
import kotlinx.android.synthetic.main.activity_category_detail.*
import kotlinx.android.synthetic.main.layout_top_view.view.*

class CategoryDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_detail)

        recycler.adapter = AdapterCategoryDetail(this)
        include.text.text = getString(R.string.addNew)
        backBt.setOnClickListener { finish() }

    }
}