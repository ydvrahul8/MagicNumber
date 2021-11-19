package com.magicnumber.mn_utils

import android.app.Activity
import android.view.View
import com.magicnumber.mn_assets.databinding.ToolbarBinding

/**
 * Created by Rahul Yadav on 19-11-2021.
 */

fun setToolbar(binding: ToolbarBinding, title: String, activity: Activity, backButton: Boolean = true) {
    binding.textViewToolbarTitle.text = title
    if (!backButton)
        binding.imageViewBack.visibility = View.GONE
    else {
        binding.imageViewBack.setOnClickListener { activity.finish() }
    }
}