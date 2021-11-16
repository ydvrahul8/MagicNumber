package com.magicnumber

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.magicnumber.mn_route.dashboard.DashboardRoute
import com.magicnumber.mn_route.splash.SplashRoute
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var splashRoute: SplashRoute

    @Inject
    lateinit var dashboardRoute: DashboardRoute

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        when (savedInstanceState) {
            null -> openSplashScreen()
            else -> openDashboardScreen()
        }
    }

    private fun openDashboardScreen() {
        startActivity(dashboardRoute.buildDashboardRoute().intent)
        finish()
    }

    private fun openSplashScreen() {
        var resultLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
                if (result.resultCode == Activity.RESULT_OK) {
                    openDashboardScreen()
                } else {
                    finish()
                }
            }
        resultLauncher.launch(splashRoute.buildSplashRoute().intent)
    }

}