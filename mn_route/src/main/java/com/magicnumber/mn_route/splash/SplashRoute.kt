package com.magicnumber.mn_route.splash

import android.content.Intent
import android.net.Uri
import com.magicnumber.mn_route.Route
import javax.inject.Inject

/**
 * Created by Rahul Yadav on 24-08-2021.
 */
private const val SCHEMA_URI_PREFIX = "magic_number://splash/"

class SplashRoute @Inject constructor() {

    fun buildSplashRoute() =
        Route(Intent(Intent.ACTION_VIEW, Uri.parse(SCHEMA_URI_PREFIX).buildUpon().build()))
}
