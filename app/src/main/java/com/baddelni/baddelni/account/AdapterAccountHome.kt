package com.baddelni.baddelni.account

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baddelni.baddelni.R

class AdapterAccountHome(val context: Context) : RecyclerView.Adapter<AdapterAccountHome.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.item_account_list, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(viewHolder: ViewHolder, postion: Int) {
        viewHolder.itemView.setOnClickListener { context.startActivity(Intent(context, ExchangeDetail::class.java)) }
    }

    override fun getItemCount() = 10

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}