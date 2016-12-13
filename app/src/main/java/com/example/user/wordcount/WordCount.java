package com.example.user.wordcount;

/**
 * Created by user on 13/12/2016.
 */
public class WordCount {

    private String string;

    public WordCount(String string) {
        this.string = string;
    }

    public String getString() {
        return this.string;
    }

    public void setString(String newString) {
        this.string = newString;
    }

    public int getWordCount(String string) {
        int length = string.split(" ").length;
        return length;
    }

}
