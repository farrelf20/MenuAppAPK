package com.example.menuapp.Common

import com.example.menuapp.Model.CategoryModel
import com.example.menuapp.Model.FoodModel
import com.example.menuapp.Model.UserModel

object Common {
    val COMMENT_REF: String = "Comments"
    var foodSelected: FoodModel?=null
    var categorySelected: CategoryModel?=null
    val CATEGORY_REF: String = "Category"
    val FULL_WIDTH_COLUMN: Int = 1
    val DEFAULT_COLUMN_COUNT: Int=0
    val BEST_DEALS_REF: String="BestDeals"
    val POPULAR_REF: String="MostPopular"
    val USER_REFERENCE="Users"
    var currentUser:UserModel?=null
}