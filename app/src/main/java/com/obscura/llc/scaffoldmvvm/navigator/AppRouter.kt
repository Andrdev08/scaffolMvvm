package com.obscura.llc.scaffoldmvvm.navigator

import com.obscura.llc.scaffoldmvvm.base.BaseActivity

interface AppRouter {
    var source: BaseActivity<*>
    fun openMainScreen()
}