package com.magicnumber.mn_dashboard.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.magicnumber.mn_dashboard.R
import com.magicnumber.mn_dashboard.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityDashboardBinding>(this, R.layout.activity_dashboard)
        val navController: NavController =
            Navigation.findNavController(this, R.id.activity_main_nav_host_fragment) as NavController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.activity_main_bottom_navigation_view)
        NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }
}