package com.obscura.llc.scaffoldmvvm.usecases.sample

import com.obscura.llc.scaffoldmvvm.database.entity.SampleEntity
import io.reactivex.Completable
import io.reactivex.Flowable

interface SampleFlow {
    fun getSampleData(): Flowable<List<SampleEntity>>
    fun fetchSampleData(): Completable
}