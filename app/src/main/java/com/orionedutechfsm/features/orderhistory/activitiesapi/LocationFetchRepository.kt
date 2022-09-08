package com.orionedutechfsm.features.orderhistory.activitiesapi

import com.orionedutechfsm.app.Pref
import com.orionedutechfsm.base.BaseResponse
import com.orionedutechfsm.features.orderhistory.model.FetchLocationRequest
import com.orionedutechfsm.features.orderhistory.model.FetchLocationResponse
import com.orionedutechfsm.features.orderhistory.model.SubmitLocationInputModel
import com.orionedutechfsm.features.orderhistory.model.UnknownReponseModel
import io.reactivex.Observable

/**
 * Created by Pratishruti on 30-11-2017.
 */
class LocationFetchRepository(val apiService: LocationFetchApi){
    fun fetchLocationUpdate(location: FetchLocationRequest): Observable<FetchLocationResponse> {
        return apiService.getLocationUpdates(location)
    }

    fun fetchLocationUpdate(date: String): Observable<FetchLocationResponse> {
        return apiService.getLocationUpdates(Pref.session_token!!, Pref.user_id!!, date)
    }

    fun fetchUnknownLocation(): Observable<UnknownReponseModel> {
        return apiService.getUnknownLocation(Pref.session_token!!, Pref.user_id!!)
    }

    fun submitLoc(loc: SubmitLocationInputModel): Observable<BaseResponse> {
        return apiService.submitLocation(loc)
    }
}