package org.ddiachenko.Task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordsCounter {

    public void countUniqueWordsInText(String filePath){
        List<String> words = new ArrayList<>();
        int counter = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                words.addAll(Arrays.asList(line.split(" ")));
            }
            Set<String> uniqueWords = new HashSet<>(words);
            for (String unique : uniqueWords) {
                for (String word : words) {
                    if (word.equals(unique)) {
                        counter++;
                    }
                }
                System.out.println(unique + " " + counter);
                counter = 0;
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }

}
