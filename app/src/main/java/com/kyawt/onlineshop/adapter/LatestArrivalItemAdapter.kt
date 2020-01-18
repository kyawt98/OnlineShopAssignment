package com.kyawt.onlineshop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.onlineshop.R
import com.kyawt.onlineshop.model.LatestArrivalItemModel
import kotlinx.android.synthetic.main.lastest_arrivals_item.view.*

class latestItemViewHolder (viewItem: View) : RecyclerView.ViewHolder(viewItem){
    var name = viewItem.findViewById<TextView>(R.id.latest_arrival_name)
    var image = viewItem.findViewById<ImageView>(R.id.latest_arrival_img)
    var brand = viewItem.findViewById<TextView>(R.id.latest_arrival_brand)
    var price = viewItem.findViewById<TextView>(R.id.latest_arrival_price)
}

class LatestArrivalItemAdapter(var itemList:ArrayList<LatestArrivalItemModel>) : RecyclerView.Adapter<latestItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): latestItemViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.lastest_arrivals_item, parent, false)
        return latestItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: latestItemViewHolder, position: Int) {
        holder.name.text = itemList[position].name
        holder.brand.text = itemList[position].brand
        holder.image.setImageResource(itemList[position].image)
        holder.price.text = itemList[position].price.toString()
    }
}