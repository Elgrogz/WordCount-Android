package com.example.user.wordcount;

/**
 * Created by user on 13/12/2016.
 */
public class WordCount {

    public WordCount() {
    }

    public int getWordCount(String string) {
        int length = string.split(" ").length;
        return length;
    }

}
