package com.magicnumber.mn_dashboard.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.magicnumber.mn_dashboard.databinding.ItemCountBinding
import com.magicnumber.mn_dashboard.databinding.ItemResultBinding
import com.magicnumber.mn_dashboard.databinding.ItemTableCountBinding

/**
 * Created by Rahul Yadav on 24-11-2021.
 */
class ResultItemAdapter : RecyclerView.Adapter<ResultItemAdapter.ResultViewHolder>() {

    private val list = ArrayList<Any>()

    inner class ResultViewHolder(private val binding: ItemResultBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(table: Any) {
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
        val binding = ItemResultBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ResultViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
       // holder.bind(list[position])
    }

    override fun getItemCount(): Int = 10
}