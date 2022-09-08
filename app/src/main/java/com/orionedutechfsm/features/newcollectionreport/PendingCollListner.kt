package com.orionedutechfsm.features.newcollectionreport

import com.orionedutechfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}