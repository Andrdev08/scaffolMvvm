package com.obscura.llc.scaffoldmvvm.network.communicator

import com.obscura.llc.scaffoldmvvm.database.entity.SampleEntity
import com.obscura.llc.scaffoldmvvm.network.api.ApiService
import io.reactivex.Single

class ServerCommunicator(
    private val api: ApiService
): Communicator {

    override fun getSampleData(): Single<List<SampleEntity>> = api.getSampleData()

}