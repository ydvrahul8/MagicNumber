package com.magicnumber.mn_dashboard.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.magicnumber.mn_dashboard.databinding.ItemCountBinding
import com.magicnumber.mn_dashboard.databinding.ItemTableCountBinding

/**
 * Created by Rahul Yadav on 24-11-2021.
 */
class CountItemAdapter : RecyclerView.Adapter<CountItemAdapter.ItemViewHolder>() {

    private val list = ArrayList<Any>()

    inner class ItemViewHolder(private val binding: ItemCountBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(table: Any) {
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemCountBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       // holder.bind(list[position])
    }

    override fun getItemCount(): Int = 50
}