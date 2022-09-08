package com.orionedutechfsm.features.orderList.model

import com.orionedutechfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}