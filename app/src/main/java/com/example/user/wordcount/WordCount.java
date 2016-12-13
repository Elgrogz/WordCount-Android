package com.example.user.wordcount;

import java.util.ArrayList;
import java.util.HashMap;

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

    public HashMap<String, Integer> eachWordTotals(String string) {
        HashMap<String, Integer> results = new HashMap<String, Integer>();
        String[] words = string.split(" ");
        for (String word : words) {
            word = word.toLowerCase();
            if (results.get(word) == null) {
                results.put(word, 1);
            }
            else results.put(word, results.get(word) + 1);
        }
        return results;
    }

}
