package com.orionedutechfsm.features.newcollection.model

import com.orionedutechfsm.app.domain.CollectionDetailsEntity
import com.orionedutechfsm.base.BaseResponse
import com.orionedutechfsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}