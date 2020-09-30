package com.example.fragmentassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fragmentassignment.adapter.clothesadapter
import com.example.fragmentassignment.model.clothes
import kotlinx.android.synthetic.main.fragment_clothesfragment.*


class clothesfragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_clothesfragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var clotheslist = ArrayList<clothes>()
        clotheslist.add(clothes("Hyde Park N41015","Louis Vuitton","999,99999 Ks",R.drawable.lvpurse))
        clotheslist.add(clothes("Hoodie","Nelly","7200000 Ks",R.drawable.blackhoodie))
        clotheslist.add(clothes("Iphone 11","Apple","10000000 Ks", R.drawable.iphone12))
        clotheslist.add(clothes("Macbook Pro","Apple","29000000 Ks", R.drawable.laptop))
        clotheslist.add(clothes("Washing Machine","Nissan","9000000 Ks", R.drawable.washingmachine))
        var ClothesAdapter = clothesadapter(clotheslist)
        clothesRecycler.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        clothesRecycler.adapter = ClothesAdapter
    }
}
