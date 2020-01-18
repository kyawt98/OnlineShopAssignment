package com.kyawt.onlineshop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.onlineshop.R
import com.kyawt.onlineshop.model.CountryModel

class CountryViewHolder(viewList : View) : RecyclerView.ViewHolder(viewList){
    var name = viewList.findViewById<TextView>(R.id.country_name)
    var image = viewList.findViewById<ImageView>(R.id.img_country)
}

class CountryAdapter (var countryList : ArrayList<CountryModel>) : RecyclerView.Adapter<CountryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.choose_by_country,parent,false)
        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.name.text = countryList[position].name
        holder.image.setImageResource(countryList[position].image)
    }
}
