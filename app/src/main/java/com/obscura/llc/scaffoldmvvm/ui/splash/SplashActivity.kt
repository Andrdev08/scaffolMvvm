package com.obscura.llc.scaffoldmvvm.ui.splash

import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import com.obscura.llc.scaffoldmvvm.base.BaseActivity
import com.obscura.llc.scaffoldmvvm.databinding.ActivitySplashBinding
import com.obscura.llc.scaffoldmvvm.utils.Constants

class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override val inflater: (LayoutInflater) -> ActivitySplashBinding
        get() = ActivitySplashBinding::inflate

    override fun setupView(binder: ActivitySplashBinding) {
        Handler(Looper.getMainLooper())
            .postDelayed({ navigator.openMainScreen() }, Constants.UI.SPLASH_DELAY)
    }

}