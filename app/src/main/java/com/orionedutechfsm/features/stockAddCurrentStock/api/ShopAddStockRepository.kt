package com.orionedutechfsm.features.stockAddCurrentStock.api

import com.orionedutechfsm.base.BaseResponse
import com.orionedutechfsm.features.location.model.ShopRevisitStatusRequest
import com.orionedutechfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.orionedutechfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.orionedutechfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.orionedutechfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}