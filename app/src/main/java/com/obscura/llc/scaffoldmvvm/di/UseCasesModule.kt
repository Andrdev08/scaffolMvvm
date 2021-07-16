package com.obscura.llc.scaffoldmvvm.di

import androidx.annotation.Keep
import com.obscura.llc.scaffoldmvvm.usecases.sample.SampleFlow
import com.obscura.llc.scaffoldmvvm.usecases.sample.SampleUseCases
import org.koin.dsl.module

@Keep
val useCasesModule = module {
    single<SampleFlow> { SampleUseCases(get()) }
}