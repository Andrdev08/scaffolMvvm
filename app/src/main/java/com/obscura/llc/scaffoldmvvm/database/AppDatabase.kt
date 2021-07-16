package com.obscura.llc.scaffoldmvvm.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.obscura.llc.scaffoldmvvm.database.dao.SampleDao
import com.obscura.llc.scaffoldmvvm.database.entity.SampleEntity
import com.obscura.llc.scaffoldmvvm.utils.Constants

@Database(
    entities = [
        SampleEntity::class
    ],
    version = Constants.Db.VERSION,
    exportSchema = false
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun sampleDao(): SampleDao
}