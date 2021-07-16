package com.obscura.llc.scaffoldmvvm.di

import androidx.annotation.Keep

@Keep
val applicationModules = listOf(
    networkModule,
    databaseModule,
    repositoryModule,
    useCasesModule,
    utilitiesModule,
    viewModelModule
)