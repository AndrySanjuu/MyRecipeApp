package com.example.myrecipeapp

data class Category(
    var idCategory: String,
    var strCategory: String,
    var strCategoryDescription: String,
    var strCategoryThumb: String
)

data class CategoriesResponse(var categories : List<Category>)