package com.example.menuapp.Callback

import com.example.menuapp.Model.PupolarCategoryModel

interface IPopularLoadCallback {
    fun onPopularLoadSuccess(popularModelList:List<PupolarCategoryModel>)
    fun onPopularLoadFailed(message:String)
}