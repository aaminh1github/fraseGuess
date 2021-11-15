package com.example.kotlinpractice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fraseguess.R

class MessageAdapter(val context: Context, val Messagmodel: ArrayList<String>) :
    RecyclerView.Adapter<MessageAdapter.Message>() {
    class Message(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Message {
        return Message(
            LayoutInflater.from(context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: Message, position: Int) {
        holder.itemView.apply {

        }
    }

    override fun getItemCount() = Messagmodel.size
}