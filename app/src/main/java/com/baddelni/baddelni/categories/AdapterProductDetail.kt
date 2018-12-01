package com.baddelni.baddelni.categories

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baddelni.baddelni.R

class AdapterProductDetail(val context: Context) : RecyclerView.Adapter<AdapterProductDetail.ViewHolder>() {

    val LONG_VIEW = 1
    val SIMPLE_VIEW = 2
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
                if (viewType == LONG_VIEW) {
                    LayoutInflater.from(context).inflate(R.layout.item_product_detail_long, parent, false)
                } else {
                    LayoutInflater.from(context).inflate(R.layout.item_product_detail_simple, parent, false)
                }
        return ViewHolder(view)

    }

    override fun getItemCount() = 11

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) LONG_VIEW else SIMPLE_VIEW
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        if (position == 0) return

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}