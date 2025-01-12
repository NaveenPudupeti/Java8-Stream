package java8StreamStringPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VowelConsonantCount {

    private static final List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public static void countVowelsAndConsonants(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input string is empty or null.");
            return;
        }

        // Convert to lowercase to handle case-insensitivity
        String processedInput = input.toLowerCase().replaceAll("[^a-z]", "");

        // Predicate for vowels
        Predicate<Character> isVowel = c -> VOWELS.contains(c);

        Map<Boolean, Long> counts = processedInput.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.partitioningBy(isVowel, Collectors.counting()));

        long vowelCount = counts.getOrDefault(true, 0L);
        long consonantCount = counts.getOrDefault(false, 0L);

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        countVowelsAndConsonants(input);
    }
}
