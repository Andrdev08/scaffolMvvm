package com.obscura.llc.scaffoldmvvm.navigator

import android.content.Intent
import com.obscura.llc.scaffoldmvvm.base.BaseActivity
import com.obscura.llc.scaffoldmvvm.ui.main.MainActivity

class Navigator(override var source: BaseActivity<*>) : AppRouter {

    override fun openMainScreen() {
        source.startActivity(Intent(source, MainActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        })
    }

}