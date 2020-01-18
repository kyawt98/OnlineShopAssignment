package com.kyawt.onlineshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.onlineshop.adapter.CountryAdapter
import com.kyawt.onlineshop.adapter.LatestArrivalItemAdapter
import com.kyawt.onlineshop.adapter.PopularAdapter
import com.kyawt.onlineshop.model.CountryModel
import com.kyawt.onlineshop.model.LatestArrivalItemModel
import com.kyawt.onlineshop.model.PopularProductModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        latestArrivalView()
        countryView()
        popularView()
    }

    fun latestArrivalView() {
        var latestArrivalRecyclerView: RecyclerView = findViewById(R.id.recycler_latest_arrivals)

        var arrivalList = ArrayList<LatestArrivalItemModel>()
        arrivalList.add(
            LatestArrivalItemModel(
                "Hyde Park N4105",
                "LOUIS VUITTON",
                R.drawable.bag,
                99999.0
            )
        )
        arrivalList.add(
            LatestArrivalItemModel(
                "Iphone 11 Pro Max",
                "Apple",
                R.drawable.iphone,
                2200000.0
            )
        )
        arrivalList.add(LatestArrivalItemModel("Camera", "Leica", R.drawable.camera, 500000.0))

        var arrivalAdapter = LatestArrivalItemAdapter(arrivalList)
        latestArrivalRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        latestArrivalRecyclerView.adapter = arrivalAdapter

    }

    fun countryView() {
        var countryRecyclerView: RecyclerView = findViewById(R.id.recycler_country)

        var countryList = ArrayList<CountryModel>()
        countryList.add(CountryModel("Japan", R.drawable.japan))
        countryList.add(CountryModel("Korea", R.drawable.korea))
        countryList.add(CountryModel("China", R.drawable.china))
        countryList.add(CountryModel("International", R.drawable.internation))

        var countryAdapter = CountryAdapter(countryList)
        countryRecyclerView.layoutManager = GridLayoutManager(this, 2)
        countryRecyclerView.adapter = countryAdapter

    }

    fun popularView(){
        var popularRecyclerView : RecyclerView = findViewById(R.id.recycler_popular_products)

        var popularList = ArrayList<PopularProductModel>()
        popularList.add(PopularProductModel("Iphone 11 Pro Max", "Apple", 2200000, 2300000, R.drawable.iphone))
        popularList.add(PopularProductModel("MacBook Pro", "Apple", 3000000,3400000, R.drawable.macbook))
        popularList.add(PopularProductModel("Bed","Sweety Home", 200000, 300000, R.drawable.bed))
        popularList.add(PopularProductModel("Camera", "Leica",400000,450000,R.drawable.camera))

        var popularAdapter = PopularAdapter(popularList)
        popularRecyclerView.layoutManager = LinearLayoutManager(this)
        popularRecyclerView.adapter = popularAdapter
    }

}
