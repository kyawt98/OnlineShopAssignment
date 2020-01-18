package com.kyawt.onlineshop.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.onlineshop.R
import com.kyawt.onlineshop.model.PopularProductModel

class PopularViewHolder(viewItem: View) : RecyclerView.ViewHolder(viewItem) {
    var name = viewItem.findViewById<TextView>(R.id.txt_name)
    var brand = viewItem.findViewById<TextView>(R.id.txt_brand)
    var price = viewItem.findViewById<TextView>(R.id.txt_price)
    var discount = viewItem.findViewById<TextView>(R.id.txt_discount)
    var image = viewItem.findViewById<ImageView>(R.id.img_popular_product)
}

class PopularAdapter(var popularList: ArrayList<PopularProductModel>) :
    RecyclerView.Adapter<PopularViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.popular_product, parent, false)
        return PopularViewHolder(view)
    }

    override fun getItemCount(): Int {
        return popularList.size
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        holder.name.text = popularList[position].name
        holder.brand.text = popularList[position].brand
        holder.price.text = popularList[position].price.toString()
        holder.discount.text = popularList[position].discount.toString()
        holder.image.setImageResource(popularList[position].image)
    }
}