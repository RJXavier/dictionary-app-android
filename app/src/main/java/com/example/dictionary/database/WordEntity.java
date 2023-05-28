package com.example.dictionary.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class WordEntity {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "english_word")
    public String englishWord;

    @ColumnInfo(name = "bangla_word")
    public String banglaWord;

    public WordEntity(String englishWord, String banglaWord) {
        this.englishWord = englishWord;
        this.banglaWord = banglaWord;
    }
}
