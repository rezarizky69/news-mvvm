package com.eja.newsmvvm.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

// the name of table in the db
@Entity(
    tableName = "articles"
)

// every field that used for component of the news
data class Article(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String
) : Serializable