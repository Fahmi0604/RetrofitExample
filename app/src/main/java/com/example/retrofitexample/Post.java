package com.example.retrofitexample;

import com.google.gson.annotations.SerializedName;

public class Post {

    private String name;

    @SerializedName("name_translations")
    private Quran_nameTranslation quran_nameTranslation;
    
    private int number_of_surah;
    private int number_of_ayah;

    @SerializedName("type")
    private String tipe_ayat;

    public int getNumber_of_surah() {
        return number_of_surah;
    }

    public int getNumber_of_ayah() {
        return number_of_ayah;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return tipe_ayat;
    }

    public Quran_nameTranslation getQuran_nameTranslation() {
        return quran_nameTranslation;
    }
}
