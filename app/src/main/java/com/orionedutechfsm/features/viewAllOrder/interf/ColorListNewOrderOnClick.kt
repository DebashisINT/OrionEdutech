package com.orionedutechfsm.features.viewAllOrder.interf

import com.orionedutechfsm.app.domain.NewOrderColorEntity
import com.orionedutechfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}