package com.magicnumber.mn_utils.extensions

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

fun FragmentActivity.replaceFragment(fragment: Fragment) {
    supportFragmentManager.replaceFragment(fragment = fragment)
}

fun FragmentActivity.addFragment(fragment: Fragment, tag: String) {
    supportFragmentManager.addFragment(fragment = fragment, tag = tag)
}

fun FragmentActivity.popBackStack(name: String, flags: Int) {
    supportFragmentManager.popBackStackImmediate(name, flags)
}

fun FragmentActivity.finish(resultCode: Int = Activity.RESULT_OK) {
    setResult(resultCode)
    finish()
}
