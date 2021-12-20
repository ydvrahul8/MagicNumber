package com.magicnumber.mn_dashboard.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.magicnumber.mn_dashboard.R
import com.magicnumber.mn_dashboard.databinding.FragmentResultBinding
import com.magicnumber.mn_utils.base.BaseFragment


class ResultFragment : BaseFragment<FragmentResultBinding>(R.layout.fragment_result) {


    companion object {

        @JvmStatic
        fun newInstance() =
            ResultFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}