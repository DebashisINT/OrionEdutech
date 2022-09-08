package com.orionedutechfsm.features.dashboard.presentation.api.dayStartEnd

import com.orionedutechfsm.app.Pref
import com.orionedutechfsm.base.BaseResponse
import com.orionedutechfsm.features.dashboard.presentation.model.DaystartDayendRequest
import com.orionedutechfsm.features.dashboard.presentation.model.StatusDayStartEnd
import com.orionedutechfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.orionedutechfsm.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }


}