
import java.util.*;

public class Main {

    static String howManyLetters = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi" +
            " ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
            "voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat " +
            "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";


    public static void main(String[] args) {

        Map<Character, Integer> word = new HashMap<>();
        howManyLetters = howManyLetters.toLowerCase();
        for (int i = 0; i < howManyLetters.length(); i++) {
            char lettersIntoSymbols = howManyLetters.charAt(i);
            if (!Character.isLetter(lettersIntoSymbols)) {
                continue;
            }
            if (word.containsKey(lettersIntoSymbols)) {
                word.put(lettersIntoSymbols, word.get(lettersIntoSymbols) + 1);
            } else {
                word.put(lettersIntoSymbols, 1);
            }
        }

        int maxValue = (Collections.max(word.values()));

        for (Map.Entry<Character, Integer> stringIntegerEntry : word.entrySet()) {
            if (stringIntegerEntry.getValue() == maxValue) {
                System.out.println("Максимум букв в тексте - " + stringIntegerEntry.getKey() + " = " + maxValue);

            }
        }

        int minValue = (Collections.min(word.values()));

        for (Map.Entry<Character, Integer> stringIntegerEntry : word.entrySet()) {
            if (stringIntegerEntry.getValue() == minValue) {
                System.out.println("Минимум букв в тексте - " + stringIntegerEntry.getKey() + " = " + minValue);
            }
        }
    }
}