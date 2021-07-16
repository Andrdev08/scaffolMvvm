package com.obscura.llc.scaffoldmvvm.di

import androidx.annotation.Keep
import com.obscura.llc.scaffoldmvvm.repository.sample.SampleRepository
import com.obscura.llc.scaffoldmvvm.repository.sample.SampleRepositoryProvider
import org.koin.dsl.module

@Keep
val repositoryModule = module {
    single<SampleRepository> { SampleRepositoryProvider(get(), get()) }
}