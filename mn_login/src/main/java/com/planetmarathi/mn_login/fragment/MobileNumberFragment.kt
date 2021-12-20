package com.planetmarathi.mn_login.fragment

import androidx.navigation.fragment.findNavController
import com.magicnumber.mn_utils.base.BaseFragment
import com.planetmarathi.mn_login.R
import com.planetmarathi.mn_login.databinding.FragmentMobileNumberBinding

class MobileNumberFragment : BaseFragment<FragmentMobileNumberBinding>(R.layout.fragment_mobile_number) {

    override fun FragmentMobileNumberBinding.initialize() {
        binding.fab.setOnClickListener {
            findNavController().navigate(R.id.action_mobileNumberFragment_to_OTPFragment)
        }
    }
}