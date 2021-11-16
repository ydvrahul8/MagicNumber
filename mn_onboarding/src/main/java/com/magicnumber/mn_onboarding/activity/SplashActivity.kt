package com.magicnumber.mn_onboarding.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.magicnumber.mn_onboarding.fragment.SplashFragment
import com.magicnumber.mn_utils.extensions.replaceFragment

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        replaceFragment(SplashFragment.newInstance())
    }
}