package com.baddelni.baddelni.categories

import android.content.Context
import android.content.Intent
import android.os.Build
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView

import com.baddelni.baddelni.R

class AdapterCategories(private var context: Context) : RecyclerView.Adapter<AdapterCategories.viewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): viewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.item_interest, viewGroup, false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: viewHolder, position: Int) {

        viewHolder.text.text = "Name $position"
        viewHolder.checkBox.isEnabled = false

        viewHolder.checkBox.isClickable = false
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            viewHolder.checkBox.isFocusable = false
        }


        viewHolder.itemView.setOnClickListener { context.startActivity(Intent(context, CategoryDetailActivity::class.java)) }

    }

    override fun getItemCount() = 20

    inner class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var checkBox: CheckBox = itemView.findViewById(R.id.checkBox)
        var text: TextView = itemView.findViewById(R.id.text)

    }
}
