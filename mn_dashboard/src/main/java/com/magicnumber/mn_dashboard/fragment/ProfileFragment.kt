package com.magicnumber.mn_dashboard.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.magicnumber.mn_dashboard.R
import com.magicnumber.mn_dashboard.databinding.FragmentProfileBinding
import com.magicnumber.mn_utils.base.BaseFragment

class ProfileFragment : BaseFragment<FragmentProfileBinding>(R.layout.fragment_profile) {

    companion object {

        @JvmStatic
        fun newInstance() =
            ProfileFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}