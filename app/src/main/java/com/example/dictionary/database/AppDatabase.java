package com.example.dictionary.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {WordEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract WordDao wordDao();
}
