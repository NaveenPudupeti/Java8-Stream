package java8StreamStringPrograms;

import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        return input.chars()
                    .mapToObj(c -> String.valueOf((char) c))
                    .distinct()
                    .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + result);
    }
}
