package com.magicnumber.mn_utils.extensions

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit

fun FragmentManager.replaceFragment(@IdRes containerViewId: Int = android.R.id.content, fragment: Fragment) {
    commit {
        replace(containerViewId, fragment)
    }
}

fun FragmentManager.addFragment(@IdRes containerViewId: Int = android.R.id.content, fragment: Fragment, tag: String) {
    commit {
        add(containerViewId, fragment)
        addToBackStack(tag)
    }
}
