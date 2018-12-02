package com.baddelni.baddelni.categories

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.baddelni.baddelni.R
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        recycler.adapter = AdapterProductDetail(this)
        backBt.setOnClickListener { finish() }

    }
}