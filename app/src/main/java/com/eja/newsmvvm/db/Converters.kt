package com.eja.newsmvvm.db

import androidx.room.TypeConverter
import com.eja.newsmvvm.models.Source

class Converters {

    // convert the source into string and place it into name
    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    // convert it back into source that take the name
    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}