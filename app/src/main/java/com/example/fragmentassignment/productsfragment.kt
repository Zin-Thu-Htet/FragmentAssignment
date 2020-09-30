package com.example.fragmentassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fragmentassignment.adapter.productsadapter
import com.example.fragmentassignment.model.products
import kotlinx.android.synthetic.main.fragment_productsfragment.*


class productsfragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_productsfragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var productlist = ArrayList<products>()
        productlist.add(products("New","30% off","PS 4 Pro","Sony","6500000 Ks",R.drawable.ps4))
        productlist.add(products("New","35% off","Iphone 11","Apple","18500000 Ks",R.drawable.iphone12))
        productlist.add(products("New","10% off","Nintendo Switch","Nintendo","5500000 Ks",R.drawable.ninswitch))
        productlist.add(products("New","15% off","Macbook Pro","Apple","28500000 Ks",R.drawable.laptop))

        var ProductsAdapter = productsadapter(productlist)
        productsRecycler.layoutManager = LinearLayoutManager(context)
        productsRecycler.adapter = ProductsAdapter
    }
}