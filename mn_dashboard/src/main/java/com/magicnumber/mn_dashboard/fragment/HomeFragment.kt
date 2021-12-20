package com.magicnumber.mn_dashboard.fragment

import android.view.View
import com.magicnumber.mn_dashboard.R
import com.magicnumber.mn_dashboard.adapter.CountItemAdapter
import com.magicnumber.mn_dashboard.adapter.ResultItemAdapter
import com.magicnumber.mn_dashboard.adapter.TableItemAdapter
import com.magicnumber.mn_dashboard.databinding.FragmentHomeBinding
import com.magicnumber.mn_utils.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
    override fun FragmentHomeBinding.initialize() {
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = TableItemAdapter()

        binding.recyclerViewNumber.setHasFixedSize(true)
        binding.recyclerViewNumber.adapter = CountItemAdapter()

        binding.include.recyclerViewResult.setHasFixedSize(true)
        binding.include.recyclerViewResult.adapter = ResultItemAdapter()

        var flag = false
        binding.appCompatCheckBox.setOnClickListener {
            if (flag) {
                binding.textViewSelectAndPay.visibility = View.VISIBLE
                binding.layoutSlotAndPrice.visibility = View.GONE
                flag = false
            } else {
                binding.textViewSelectAndPay.visibility = View.GONE
                binding.layoutSlotAndPrice.visibility = View.VISIBLE
                flag = true
            }
        }
    }
}