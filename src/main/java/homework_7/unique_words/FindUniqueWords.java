package homework_7.unique_words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindUniqueWords {
    public ArrayList<String> findUniqueWords(ArrayList<String> inputList) {
        ArrayList<String> uniqueWords = new ArrayList<>();
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : inputList) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("Уникальные слова:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        System.out.println("\nКоличество повторений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        return uniqueWords;
    }
}
