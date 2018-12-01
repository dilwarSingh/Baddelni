package com.baddelni.baddelni.notifications

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baddelni.baddelni.R

class AdapterNotifications(val context: Context) : RecyclerView.Adapter<AdapterNotifications.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterNotifications.ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.item_notifications, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = 10

    override fun onBindViewHolder(viewHolder: AdapterNotifications.ViewHolder, position: Int) {
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}