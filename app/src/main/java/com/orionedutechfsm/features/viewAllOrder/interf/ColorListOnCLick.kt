package com.orionedutechfsm.features.viewAllOrder.interf

import com.orionedutechfsm.app.domain.NewOrderGenderEntity
import com.orionedutechfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}