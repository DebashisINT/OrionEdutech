package com.orionedutechfsm.features.lead.api

import com.orionedutechfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.orionedutechfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}