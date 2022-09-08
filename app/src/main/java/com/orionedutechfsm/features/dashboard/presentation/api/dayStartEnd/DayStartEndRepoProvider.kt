package com.orionedutechfsm.features.dashboard.presentation.api.dayStartEnd

import com.orionedutechfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.orionedutechfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}