package com.orionedutechfsm.features.location.api

import com.orionedutechfsm.app.Pref
import com.orionedutechfsm.base.BaseResponse
import com.orionedutechfsm.features.location.model.AppInfoInputModel
import com.orionedutechfsm.features.location.model.AppInfoResponseModel
import com.orionedutechfsm.features.location.model.ShopDurationRequest
import com.orionedutechfsm.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }
}