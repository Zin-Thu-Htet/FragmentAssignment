package com.example.fragmentassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fragmentassignment.adapter.countryadapter
import com.example.fragmentassignment.model.country
import kotlinx.android.synthetic.main.fragment_countryfragment.*


class countryfragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_countryfragment, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var countrylist = ArrayList<country>()
        countrylist.add(country("Japan",R.drawable.japan))
        countrylist.add(country("Korea",R.drawable.korea))
        countrylist.add(country("China",R.drawable.china))
        countrylist.add(country("International",R.drawable.international))
        var CountryAdapter = countryadapter(countrylist)
        countryRecycler.layoutManager = GridLayoutManager(context,2)
        countryRecycler.adapter = CountryAdapter
    }
}
