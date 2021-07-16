package com.obscura.llc.scaffoldmvvm.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.obscura.llc.scaffoldmvvm.navigator.AppRouter
import com.obscura.llc.scaffoldmvvm.navigator.Navigator

abstract class BaseActivity<V: ViewBinding>: AppCompatActivity() {

    protected lateinit var binding: V

    protected lateinit var navigator: AppRouter

    abstract val inflater: (LayoutInflater) -> V

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflater.invoke(layoutInflater)
        navigator = Navigator(this)
        setContentView(binding.root)
        setupView(binding)
    }

    abstract fun setupView(binder: V)
}