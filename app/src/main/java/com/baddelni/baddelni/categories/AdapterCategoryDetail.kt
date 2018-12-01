package com.baddelni.baddelni.categories

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baddelni.baddelni.R

class AdapterCategoryDetail(val context: Context) : RecyclerView.Adapter<AdapterCategoryDetail.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_category_details, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = 40

    override fun onBindViewHolder(viewHolder: ViewHolder, postion: Int) {
        viewHolder.itemView.setOnClickListener { context.startActivity(Intent(context, ProductDetailActivity::class.java)) }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}