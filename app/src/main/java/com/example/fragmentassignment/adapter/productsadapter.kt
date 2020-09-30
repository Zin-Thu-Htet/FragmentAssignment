package com.example.fragmentassignment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentassignment.R
import com.example.fragmentassignment.model.products
import kotlinx.android.synthetic.main.item_products.view.*

class productsadapter(var productslist : ArrayList<products>) : RecyclerView.Adapter<productsadapter.productsViewHolder>() {
    class productsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(Products: products) {
            itemView.productsexpire.text = Products.expire
            itemView.productsdiscount.text = Products.discount
            itemView.productsname.text = Products.name
            itemView.productsbrand.text = Products.brand
            itemView.productsprice.text = Products.price
            itemView.imgproducts.setImageResource(Products.img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): productsViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_products,parent,false)
        return productsViewHolder(view)
    }

    override fun getItemCount(): Int = productslist.size

    override fun onBindViewHolder(holder: productsViewHolder, position: Int) {
        holder.bind(productslist[position])
    }
}