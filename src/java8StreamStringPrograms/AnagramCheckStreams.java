package java8StreamStringPrograms;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramCheckStreams {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        // Count occurrences of each character
        return str1.toLowerCase().chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .equals(
                        str2.toLowerCase().chars()
                                .boxed()
                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                );
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
