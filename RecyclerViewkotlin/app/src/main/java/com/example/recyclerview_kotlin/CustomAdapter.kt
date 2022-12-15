package com.example.recyclerview_kotlin

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter (private val mList: List<ItemsViewModel>):
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        println("view holder created here")
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.card_view_design, parent, false);

        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val itemsViewModel = mList[position]
        if (itemsViewModel.text == null) {
            itemsViewModel.text = "NULL Data"
        }
        if (position < 10 ) {
            holder.textView.text = itemsViewModel.text + " 1-10"
            println("on bind view holder here with position 1-10: $position")
        } else {
            holder.textView.text = itemsViewModel.text + " 11-20"
            println("on bind view holder here with position 10-20: $position")
        }

        holder.imageView.setImageResource(itemsViewModel.image)

//        holder.textView.text = itemsViewModel.text
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder (ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView:  TextView = itemView.findViewById(R.id.textView)
    }
}