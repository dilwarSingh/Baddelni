package com.baddelni.baddelni.loginRegister.interests

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView

import com.baddelni.baddelni.R

class AdapterInterests(private var titles: List<String>, private var context: Context) : RecyclerView.Adapter<AdapterInterests.viewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): viewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.item_interest, viewGroup, false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: viewHolder, position: Int) {

        viewHolder.text.text = titles[position]


    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var checkBox: CheckBox = itemView.findViewById(R.id.checkBox)
        var text: TextView = itemView.findViewById(R.id.text)

    }
}
