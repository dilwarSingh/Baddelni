package com.baddelni.baddelni.account

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baddelni.baddelni.R

class AdapterRequests(val context: Context) : RecyclerView.Adapter<AdapterRequests.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.item_request, parent, false)
        return ViewHolder(view)
    }


    override fun getItemCount() = 10

    override fun onBindViewHolder(viewHolder: ViewHolder, postion: Int) {
        viewHolder.itemView.setOnClickListener {
            context.startActivity(Intent(context, ExchangeDetail::class.java))
            (context as RequestsActivity).finish()
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}