package com.example.fragmentassignment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentassignment.R
import com.example.fragmentassignment.model.country
import kotlinx.android.synthetic.main.countryname.view.*

class countryadapter (var countrylist: ArrayList<country>): RecyclerView.Adapter<countryadapter.countryViewHolder>(){
    class countryViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        fun bind(Country : country){
            itemView.countryname.text = Country.name
            itemView.countryimg.setImageResource(Country.img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): countryViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.countryname,parent,false)
        return countryViewHolder(view)
    }

    override fun getItemCount(): Int = countrylist.size

    override fun onBindViewHolder(holder: countryViewHolder, position: Int) {
        holder.bind(countrylist[position])
    }

}