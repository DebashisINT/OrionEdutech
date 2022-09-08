package com.orionedutechfsm.features.viewAllOrder.interf

import com.orionedutechfsm.app.domain.NewOrderGenderEntity
import com.orionedutechfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}