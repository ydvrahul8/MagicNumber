package com.planetmarathi.mn_login.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.magicnumber.mn_route.dashboard.DashboardRoute
import com.magicnumber.mn_utils.base.BaseFragment
import com.magicnumber.mn_utils.setToolbar
import com.planetmarathi.mn_login.R
import com.planetmarathi.mn_login.databinding.FragmentNameAndEmailIDBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class NameAndEmailIDFragment : BaseFragment<FragmentNameAndEmailIDBinding>(R.layout.fragment_name_and_email_i_d) {

    @Inject
    lateinit var dashBoardRoute:DashboardRoute

    override fun FragmentNameAndEmailIDBinding.initialize() {
        binding.imageViewBackButton.setOnClickListener {activity?.onBackPressed()}
        binding.fab.setOnClickListener {
            openDashboard()
        }
    }

    private fun openDashboard() {
        startActivity(dashBoardRoute.buildDashboardRoute().intent)
    }
}