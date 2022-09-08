package com.orionedutechfsm.features.viewAllOrder.interf

import com.orionedutechfsm.app.domain.NewOrderGenderEntity
import com.orionedutechfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}