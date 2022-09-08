package com.orionedutechfsm.features.stockAddCurrentStock.api

import com.orionedutechfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.orionedutechfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}