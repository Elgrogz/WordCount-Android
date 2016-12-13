package com.example.user.wordcount;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 13/12/2016.
 */


public class WordCountTest {

    private String string;
    private WordCount wordCount;

        @Before
        public void before() {
            string = "it was the best of times it was the worst of times it was the age of wisdom it was the age of foolishness it was the epoch of belief it was the epoch of incredulity …";
            wordCount = new WordCount();
        }

        @Test
        public void canCountWords() {
            assertEquals(37, wordCount.getWordCount(string));
            System.out.println(string);
        }
}
