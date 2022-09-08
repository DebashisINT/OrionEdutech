package com.orionedutechfsm.features.stock.api

import com.orionedutechfsm.app.Pref
import com.orionedutechfsm.base.BaseResponse
import com.orionedutechfsm.features.stock.model.AddStockInputParamsModel
import com.orionedutechfsm.features.stock.model.NewStockListResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 17-09-2019.
 */
class StockRepository(val apiService: StockApi) {

    fun addStock(addStock: AddStockInputParamsModel): Observable<BaseResponse> {
        return apiService.addStock(addStock)
    }

    fun getStockList(): Observable<NewStockListResponseModel> {
        return apiService.getStockList(Pref.session_token!!, Pref.user_id!!)
    }
}