package com.example.menuapp.Callback

import com.example.menuapp.Model.BestDealModel
import com.example.menuapp.Model.PupolarCategoryModel

interface IBestDealLoadCallback {
    fun onBestDealLoadSuccess(bestDealList:List<BestDealModel>)
    fun onBestDealLoadFailed(message:String)
}