package java8StreamMiscellaneousProgram;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {

    public static void main(String[] args) {
        String input = "hello world";

        // Method to count character frequency
        Map<Character, Integer> frequencyMap = countCharacterFrequency(input);

        // Print the frequency map using Java 8 forEach
        frequencyMap.forEach((character, frequency) -> 
            System.out.println(character + ": " + frequency)
        );
    }

    // Function to count frequency of characters
    public static Map<Character, Integer> countCharacterFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Convert string to char array and iterate
        input.chars()
             .mapToObj(c -> (char) c) // Convert int to char
             .filter(Character::isLetterOrDigit) // Optional: filter out non-alphanumeric characters
             .forEach(c -> frequencyMap.merge(c, 1, Integer::sum));

        return frequencyMap;
    }
}
