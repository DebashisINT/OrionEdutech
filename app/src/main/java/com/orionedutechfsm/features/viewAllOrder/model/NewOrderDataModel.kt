package com.orionedutechfsm.features.viewAllOrder.model

import com.orionedutechfsm.app.domain.NewOrderColorEntity
import com.orionedutechfsm.app.domain.NewOrderGenderEntity
import com.orionedutechfsm.app.domain.NewOrderProductEntity
import com.orionedutechfsm.app.domain.NewOrderSizeEntity
import com.orionedutechfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

