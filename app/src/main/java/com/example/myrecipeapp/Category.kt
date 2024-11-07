package com.example.myrecipeapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category(
    var idCategory: String,
    var strCategory: String,
    var strCategoryDescription: String,
    var strCategoryThumb: String
):Parcelable

data class CategoriesResponse(var categories : List<Category>)