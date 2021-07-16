package com.obscura.llc.scaffoldmvvm.domain

import com.obscura.llc.scaffoldmvvm.base.BaseViewModel
import com.obscura.llc.scaffoldmvvm.database.entity.SampleEntity
import com.obscura.llc.scaffoldmvvm.usecases.sample.SampleFlow
import com.obscura.llc.scaffoldmvvm.utils.RxTransformers
import com.obscura.llc.scaffoldmvvm.utils.SingleLiveEvent
import io.reactivex.rxkotlin.subscribeBy

class DefaultViewModel(
    private val flow: SampleFlow,
    private val rx: RxTransformers
): BaseViewModel() {

    val data = SingleLiveEvent<List<SampleEntity>>()

    init {
        add(
            flow.getSampleData()
                .compose(rx.presentationFlowableTransformer())
                .subscribeBy { data.postValue(it) }
        )
    }

    fun fetchData() {
        onLoadStarted()
        add(
            flow.fetchSampleData()
                .compose(rx.fetchingCompletableTransformer())
                .subscribe(::onLoadFinished, ::onError)
        )
    }
}