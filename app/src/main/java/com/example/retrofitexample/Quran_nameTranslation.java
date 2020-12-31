package com.example.retrofitexample;

import com.google.gson.annotations.SerializedName;

public class Quran_nameTranslation {

    @SerializedName("ar")
    private String arab;

    @SerializedName("en")
    private String english;

    @SerializedName("id")
    private String indonesia;

    public String getArab() {
        return arab;
    }

    public String getEnglish() {
        return english;
    }

    public String getIndonesia() {
        return indonesia;
    }
}
