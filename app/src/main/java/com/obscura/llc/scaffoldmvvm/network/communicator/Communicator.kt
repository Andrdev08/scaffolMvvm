package com.obscura.llc.scaffoldmvvm.network.communicator

import com.obscura.llc.scaffoldmvvm.database.entity.SampleEntity
import io.reactivex.Single

interface Communicator {
    fun getSampleData(): Single<List<SampleEntity>>
}