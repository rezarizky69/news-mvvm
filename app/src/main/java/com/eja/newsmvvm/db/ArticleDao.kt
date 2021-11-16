package com.eja.newsmvvm.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.eja.newsmvvm.models.Article

// data access object for room db
@Dao
interface ArticleDao {

    // query for insert news article into db
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article): Long

    // query for get all the articles
    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

    // query for delete the article
    @Delete
    suspend fun deleteArticle(article: Article)
}