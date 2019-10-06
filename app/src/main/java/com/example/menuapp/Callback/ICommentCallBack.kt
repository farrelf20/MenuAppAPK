package com.example.menuapp.Callback

import com.example.menuapp.Model.CategoryModel
import com.example.menuapp.Model.CommentModel

interface ICommentCallBack {
    fun onCommentLoadSuccess(commentList:List<CommentModel>)
    fun onCommentLoadFailed(message:String)
}