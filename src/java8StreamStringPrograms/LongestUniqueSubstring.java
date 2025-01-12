package java8StreamStringPrograms;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstring {

    public static String findLongestUniqueSubstring(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        Map<Character, Integer> seenChars = new HashMap<>();
        int start = 0, maxLength = 0, maxStart = 0;

        for (int end = 0; end < input.length(); end++) {
            char currentChar = input.charAt(end);

            // If character is repeated, move the start pointer
            if (seenChars.containsKey(currentChar) && seenChars.get(currentChar) >= start) {
                start = seenChars.get(currentChar) + 1;
            }

            // Update the character's latest position
            seenChars.put(currentChar, end);

            // Check for a new max length
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }

        return input.substring(maxStart, maxStart + maxLength);
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        String result = findLongestUniqueSubstring(input);
        System.out.println("Longest unique substring: " + result);
    }
}
