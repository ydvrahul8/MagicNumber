package com.magicnumber.mn_dashboard.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.magicnumber.mn_dashboard.databinding.ItemTableCountBinding

/**
 * Created by Rahul Yadav on 24-11-2021.
 */
class TableItemAdapter : RecyclerView.Adapter<TableItemAdapter.TableItemViewHolder>() {

    private val list = ArrayList<Any>()

    inner class TableItemViewHolder(private val binding: ItemTableCountBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(table: Any) {
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TableItemViewHolder {
        val binding = ItemTableCountBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TableItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TableItemViewHolder, position: Int) {
       // holder.bind(list[position])
    }

    override fun getItemCount(): Int = 10
}