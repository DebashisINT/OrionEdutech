package com.orionedutechfsm.features.login.model.productlistmodel

import com.orionedutechfsm.app.domain.ModelEntity
import com.orionedutechfsm.app.domain.ProductListEntity
import com.orionedutechfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}