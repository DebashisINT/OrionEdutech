package com.orionedutechfsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.orionedutechfsm.app.FileUtils
import com.orionedutechfsm.base.BaseResponse
import com.orionedutechfsm.features.NewQuotation.model.*
import com.orionedutechfsm.features.addshop.model.AddShopRequestData
import com.orionedutechfsm.features.addshop.model.AddShopResponse
import com.orionedutechfsm.features.damageProduct.model.DamageProductResponseModel
import com.orionedutechfsm.features.damageProduct.model.delBreakageReq
import com.orionedutechfsm.features.damageProduct.model.viewAllBreakageReq
import com.orionedutechfsm.features.login.model.userconfig.UserConfigResponseModel
import com.orionedutechfsm.features.myjobs.model.WIPImageSubmit
import com.orionedutechfsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}