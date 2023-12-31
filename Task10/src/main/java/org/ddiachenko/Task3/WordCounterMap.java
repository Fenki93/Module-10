package org.ddiachenko.Task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounterMap {

    public void countUniqueWords(String filePath) {
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

            List<Map.Entry<String, Integer>> sortedEntries = wordCount.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .toList();

            for (Map.Entry<String, Integer> entry : sortedEntries) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
