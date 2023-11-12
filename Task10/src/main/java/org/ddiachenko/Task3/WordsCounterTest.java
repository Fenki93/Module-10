package org.ddiachenko.Task3;

public class WordsCounterTest {

    public static void main(String[] args) {
        new WordsCounter().countUniqueWordsInText("path to file");
        new WordCounterMap().countUniqueWords("path to file");

    }
}
