package com.obscura.llc.scaffoldmvvm.di

import androidx.annotation.Keep
import com.obscura.llc.scaffoldmvvm.utils.RxTransformers
import org.koin.dsl.module

@Keep
val utilitiesModule = module {
    single { RxTransformers() }
}