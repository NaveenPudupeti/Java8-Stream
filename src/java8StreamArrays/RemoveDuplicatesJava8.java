package java8StreamArrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesJava8 {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 2, 5, 1, 6};

        // Remove duplicates using Stream distinct() and collect as a list
        Integer[] uniqueArray = Arrays.stream(array)
                                      .distinct()
                                      .toArray(Integer[]::new);

        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}
