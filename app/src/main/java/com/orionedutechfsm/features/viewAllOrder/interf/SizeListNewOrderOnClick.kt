package com.orionedutechfsm.features.viewAllOrder.interf

import com.orionedutechfsm.app.domain.NewOrderProductEntity
import com.orionedutechfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}