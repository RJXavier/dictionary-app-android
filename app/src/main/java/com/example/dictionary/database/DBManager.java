package com.example.dictionary.database;

import android.content.Context;
import androidx.room.Room;


public class DBManager {

    public static AppDatabase getDB(Context context) {
        return Room.databaseBuilder(context, AppDatabase.class, "dictionary").allowMainThreadQueries().build();
    }

    public static void initData(Context context) {
        WordDao wordDao = getDB(context).wordDao();
        if (wordDao.getCount() != 0) {
            return;
        }
        wordDao.insert(new WordEntity("Book", "বই"));
        wordDao.insert(new WordEntity("School", "বিদ্যালয়"));
        wordDao.insert(new WordEntity("University", "বিশ্ববিদ্যালয়"));
        wordDao.insert(new WordEntity("Exercise", "অনুশীলন"));
        wordDao.insert(new WordEntity("Home", "বাড়ি"));
        wordDao.insert(new WordEntity("Work", "কাজ"));
        wordDao.insert(new WordEntity("Practical", "ব্যবহারিক"));
        wordDao.insert(new WordEntity("Pen", "কলম"));
        wordDao.insert(new WordEntity("Rice", "ভাত"));
        wordDao.insert(new WordEntity("News", "সংবাদ"));
        wordDao.insert(new WordEntity("Newspaper", "সংবাদপত্র"));
    }
}
