package com.example.dictionary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.dictionary.database.AppDatabase;
import com.example.dictionary.database.DBManager;
import com.example.dictionary.database.WordEntity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final String LOG_TAG = "DICTIONARY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView wordsHolder = findViewById(R.id.wordsHolder);

        DBManager.initData(getApplicationContext());
        AppDatabase db = DBManager.getDB(getApplicationContext());
        List<WordEntity> dbWords = db.wordDao().getAll();

        List<WordDataModel> words = WordDataModel.getDataList();

        DictionaryAdapter dictionaryAdapter = new DictionaryAdapter(dbWords);

        wordsHolder.setAdapter(dictionaryAdapter);
        LinearLayoutManager layoutManager =  new LinearLayoutManager(this);
        wordsHolder.setLayoutManager(layoutManager);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(wordsHolder.getContext(), layoutManager.getOrientation());
        wordsHolder.addItemDecoration(dividerItemDecoration);

        Log.v(LOG_TAG, "On Create Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "On Start Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "On Stop Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "On Resume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "On Pause Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "On Destroy Called");
    }
}