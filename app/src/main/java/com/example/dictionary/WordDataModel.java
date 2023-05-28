package com.example.dictionary;

import java.util.ArrayList;
import java.util.List;

public class WordDataModel {

    public String english;
    public String bangla;

    public WordDataModel(String english, String bangla) {
        this.english = english;
        this.bangla = bangla;
    }

    public String getEnglish() {
        return english;
    }

    public WordDataModel setEnglish(String english) {
        this.english = english;
        return this;
    }

    public String getBangla() {
        return bangla;
    }

    public WordDataModel setBangla(String bangla) {
        this.bangla = bangla;
        return this;
    }


    public static List<WordDataModel> getDataList() {
        ArrayList<WordDataModel> dictionary = new ArrayList<>();
        dictionary.add(new WordDataModel("Book", "বই"));
        dictionary.add(new WordDataModel("School", "বিদ্যালয়"));
        dictionary.add(new WordDataModel("University", "বিশ্ববিদ্যালয়"));
        dictionary.add(new WordDataModel("Exercise", "অনুশীলন"));
        dictionary.add(new WordDataModel("Home", "বাড়ি"));
        dictionary.add(new WordDataModel("Work", "কাজ"));
        dictionary.add(new WordDataModel("Practical", "ব্যবহারিক"));
        dictionary.add(new WordDataModel("Pen", "কলম"));
        dictionary.add(new WordDataModel("Rice", "ভাত"));
        dictionary.add(new WordDataModel("News", "সংবাদ"));
        dictionary.add(new WordDataModel("Newspaper", "সংবাদপত্র"));
        return dictionary;
    }

}
