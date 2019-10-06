package com.example.menuapp.Callback

import com.example.menuapp.Model.CategoryModel
import com.example.menuapp.Model.PupolarCategoryModel

interface ICategoryCallbackListener {
    fun onCategoryLoadSuccess(categoriesList:List<CategoryModel>)
    fun onCategoryLoadFailed(message:String)
}