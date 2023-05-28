package com.example.dictionary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.database.WordEntity;

import java.util.List;


public class DictionaryAdapter extends RecyclerView.Adapter<DictionaryAdapter.ViewHolder> {

//    private List<WordDataModel> wordCollections;
    private List<WordEntity> wordCollections;

//    public DictionaryAdapter(List<WordDataModel> wordCollections) {
//        this.wordCollections = wordCollections;
//    }

    public DictionaryAdapter(List<WordEntity> wordCollections) {
        this.wordCollections = wordCollections;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.dictionary_item, parent, false);
        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(DictionaryAdapter.ViewHolder holder, int position) {
//        WordDataModel wordDataModel = wordCollections.get(position);
//        holder.englishWord.setText(wordDataModel.english);
//        holder.banglaWord.setText(wordDataModel.bangla);

        WordEntity wordDataModel = wordCollections.get(position);
        holder.englishWord.setText(wordDataModel.englishWord);
        holder.banglaWord.setText(wordDataModel.banglaWord);
    }

    @Override
    public int getItemCount() {
        return wordCollections.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView englishWord;
        public TextView banglaWord;

        public ViewHolder(View itemView) {
            super(itemView);
            englishWord = itemView.findViewById(R.id.englishWord);
            banglaWord = itemView.findViewById(R.id.banglaWord);
        }
    }

}
