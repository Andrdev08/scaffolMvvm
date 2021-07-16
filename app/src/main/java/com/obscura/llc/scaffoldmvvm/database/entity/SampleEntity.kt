package com.obscura.llc.scaffoldmvvm.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.obscura.llc.scaffoldmvvm.base.BaseEntity
import com.obscura.llc.scaffoldmvvm.utils.Constants
import com.google.gson.annotations.SerializedName

@Entity(tableName = Constants.Db.SAMPLE)
data class SampleEntity(
    @PrimaryKey(autoGenerate = false)
    @SerializedName("id")
    val id: Int,
    @SerializedName("userId")
    val userId: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("completed")
    val completed: Boolean
): BaseEntity()