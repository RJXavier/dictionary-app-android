package com.example.dictionary.database;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface WordDao {

    @Query("SELECT * FROM WordEntity")
    List<WordEntity> getAll();

    @Insert
    void insert(WordEntity wordEntity);

    @Delete
    void delete(WordEntity wordEntity);

    @Query("SELECT * FROM WordEntity WHERE id=:id")
    WordEntity findById(int id);

    @Query("SELECT COUNT(id) FROM WordEntity")
    int getCount();

}
