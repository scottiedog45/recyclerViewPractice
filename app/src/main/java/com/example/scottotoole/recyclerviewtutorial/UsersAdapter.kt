package com.example.scottotoole.recyclerviewtutorial

import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*


class UsersAdapter(val users: ArrayList<String>) : RecyclerView.Adapter<UsersAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val firstName : TextView = itemView.findViewById(R.id.firstName)

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view : View = LayoutInflater.from(p0.context).inflate(R.layout.userrow, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount() : Int = users.size

    override fun onBindViewHolder(holder: ViewHolder, p1: Int) {
        holder.firstName.text = users[p1]
    }
}