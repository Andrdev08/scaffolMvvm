package com.obscura.llc.scaffoldmvvm.repository.sample

import com.obscura.llc.scaffoldmvvm.database.entity.SampleEntity
import io.reactivex.Completable
import io.reactivex.Flowable

interface SampleRepository {

    fun getSampleData(): Flowable<List<SampleEntity>>

    fun fetchSampleData(): Completable

}