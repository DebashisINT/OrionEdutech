package com.orionedutechfsm.features.location.shopRevisitStatus

import com.orionedutechfsm.features.location.shopdurationapi.ShopDurationApi
import com.orionedutechfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}