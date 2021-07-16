package com.obscura.llc.scaffoldmvvm.repository.sample

import com.obscura.llc.scaffoldmvvm.database.AppDatabase
import com.obscura.llc.scaffoldmvvm.database.entity.SampleEntity
import com.obscura.llc.scaffoldmvvm.network.communicator.Communicator
import io.reactivex.Completable
import io.reactivex.Flowable

class SampleRepositoryProvider(
    private val communicator: Communicator,
    private val database: AppDatabase
): SampleRepository {

    override fun getSampleData(): Flowable<List<SampleEntity>> {
        return database.sampleDao().queryFlow()
    }

    override fun fetchSampleData(): Completable {
        return communicator.getSampleData().flatMapCompletable {
            Completable.fromAction {
                database.sampleDao().deleteAll()
                database.sampleDao().insertList(it)
            }
        }
    }

}