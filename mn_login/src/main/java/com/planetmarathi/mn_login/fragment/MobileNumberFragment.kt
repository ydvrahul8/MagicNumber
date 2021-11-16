package com.planetmarathi.mn_login.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.planetmarathi.mn_login.R

class MobileNumberFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mobile_number, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            MobileNumberFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}