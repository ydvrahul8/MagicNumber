package com.planetmarathi.mn_login.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.magicnumber.mn_utils.extensions.replaceFragment
import com.planetmarathi.mn_login.R
import com.planetmarathi.mn_login.fragment.MobileNumberFragment

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        replaceFragment(MobileNumberFragment.newInstance())
    }
}