package com.orionedutechfsm.features.document.api

import com.orionedutechfsm.features.dymanicSection.api.DynamicApi
import com.orionedutechfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}