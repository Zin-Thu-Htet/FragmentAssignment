package com.example.fragmentassignment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentassignment.R
import com.example.fragmentassignment.model.clothes
import kotlinx.android.synthetic.main.item_clothes.view.*

class clothesadapter (var clotheslist: ArrayList<clothes>) :  RecyclerView.Adapter<clothesadapter.clothesViewHolder>(){
    class clothesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(Clothes: clothes){
            itemView.clothesname.text = Clothes.name
            itemView.clothesbrand.text = Clothes.brand
            itemView.clothesprice.text = Clothes.price.toString()
            itemView.imgclothes.setImageResource(Clothes.image)

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): clothesViewHolder {
      var view = LayoutInflater.from(parent.context)
          .inflate(R.layout.item_clothes,parent,false)
      return clothesViewHolder(view)
    }

    override fun getItemCount(): Int = clotheslist.size

    override fun onBindViewHolder(holder: clothesViewHolder, position: Int) {
       holder.bind(clotheslist[position])
    }
}