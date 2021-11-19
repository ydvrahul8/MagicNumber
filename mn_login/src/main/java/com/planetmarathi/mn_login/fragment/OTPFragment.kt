package com.planetmarathi.mn_login.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.magicnumber.mn_utils.base.BaseFragment
import com.magicnumber.mn_utils.setToolbar
import com.planetmarathi.mn_login.R
import com.planetmarathi.mn_login.databinding.FragmentOTPBinding

class OTPFragment : BaseFragment<FragmentOTPBinding>(R.layout.fragment_o_t_p) {

    override fun FragmentOTPBinding.initialize() {
        setToolbar(toolbar, "",requireActivity())
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            OTPFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}