package com.orionedutechfsm.features.nearbyuserlist.api

import com.orionedutechfsm.app.Pref
import com.orionedutechfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.orionedutechfsm.features.newcollection.model.NewCollectionListResponseModel
import com.orionedutechfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}