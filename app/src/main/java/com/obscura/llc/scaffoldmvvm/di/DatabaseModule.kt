package com.obscura.llc.scaffoldmvvm.di

import androidx.annotation.Keep
import androidx.room.Room
import com.obscura.llc.scaffoldmvvm.database.AppDatabase
import com.obscura.llc.scaffoldmvvm.utils.Constants
import org.koin.dsl.module

@Keep
val databaseModule = module {
    single {
        Room.databaseBuilder(
            get(),
            AppDatabase::class.java,
            Constants.Db.NAME
        )
            .fallbackToDestructiveMigration()
            .build()
    }
}