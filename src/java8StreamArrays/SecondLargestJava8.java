package java8StreamArrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondLargestJava8 {

    public static void main(String[] args) {
        int[] array = {12, 11, 1, 10, 3, 1};

        // Find second largest using streams
        OptionalInt secondLargest = Arrays.stream(array)
                                          .distinct()                 // Remove duplicates
                                          .sorted()                   // Sort in ascending order
                                          .limit(array.length - 1)    // Skip last element (largest)
                                          .max();                     // Get max of the remaining

        // Display result
        secondLargest.ifPresentOrElse(
            value -> System.out.println("Second largest element: " + value),
            () -> System.out.println("No second largest element found.")
        );
    }
}
