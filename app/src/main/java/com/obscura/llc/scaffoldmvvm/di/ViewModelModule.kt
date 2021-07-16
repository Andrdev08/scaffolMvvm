package com.obscura.llc.scaffoldmvvm.di

import androidx.annotation.Keep
import com.obscura.llc.scaffoldmvvm.domain.DefaultViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

@Keep
val viewModelModule = module(override = true) {
    viewModel { DefaultViewModel(get(), get()) }
}