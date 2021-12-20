package com.planetmarathi.mn_login.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.magicnumber.mn_utils.base.BaseFragment
import com.magicnumber.mn_utils.setToolbar
import com.planetmarathi.mn_login.R
import com.planetmarathi.mn_login.databinding.FragmentOTPBinding

class OTPFragment : BaseFragment<FragmentOTPBinding>(R.layout.fragment_o_t_p) {

    override fun FragmentOTPBinding.initialize() {
        binding.fab.setOnClickListener {
            findNavController().navigate(R.id.action_OTPFragment_to_nameAndEmailIDFragment)
        }
        binding.imageViewBackButton.setOnClickListener {activity?.onBackPressed()}
    }
}