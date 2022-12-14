package com.orionedutechfsm.features.location.shopRevisitStatus

import com.orionedutechfsm.base.BaseResponse
import com.orionedutechfsm.features.location.model.ShopDurationRequest
import com.orionedutechfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}