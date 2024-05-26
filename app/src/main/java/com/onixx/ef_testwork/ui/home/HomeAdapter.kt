package com.onixx.ef_testwork.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.onixx.domain.models.Offer
import com.onixx.ef_testwork.R
import java.text.DecimalFormat


class HomeAdapter(private val offers: List<Offer>) : RecyclerView
.Adapter<HomeAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.name)
        val town: TextView = itemView.findViewById(R.id.town)
        val price: TextView = itemView.findViewById(R.id.price)
        val image: ImageView = itemView.findViewById(R.id.MainImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_fragment_scroll_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text = offers[position].title
        holder.town.text = offers[position].town

        holder.price.text =  DecimalFormat("#,###")
                .format(offers[position].price!!.value)
                .replace(",", " ")
            .plus(" ₽")

        when (offers[position].id!!) {
            0 -> holder.image.setImageResource(R.drawable.pair)
            1 -> holder.image.setImageResource(R.drawable.pair2)
            else -> {
                holder.image.setImageResource(R.drawable.girl)
            }
        }
    }



    override fun getItemCount() = offers.size
}