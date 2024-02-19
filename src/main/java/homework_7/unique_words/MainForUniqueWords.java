package homework_7.unique_words;

import java.util.ArrayList;

public class MainForUniqueWords {
    public static void main(String[] args) {
        ArrayList<String> genresList = new ArrayList<>();
        genresList.add("rock");
        genresList.add("pop");
        genresList.add("rock");
        genresList.add("jazz");
        genresList.add("blues");
        genresList.add("pop");
        genresList.add("rock");
        genresList.add("hip-hop");
        genresList.add("jazz");
        genresList.add("pop");

        FindUniqueWords findUniqueWords = new FindUniqueWords();
        findUniqueWords.findUniqueWords(genresList);
    }
}
