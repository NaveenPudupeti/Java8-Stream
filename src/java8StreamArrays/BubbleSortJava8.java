package java8StreamArrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSortJava8 {

    public static void bubbleSort(int[] array) {
        int n = array.length;

        // Outer loop for each pass through the array
        for (int i = 0; i < n - 1; i++) {
            // Inner loop using IntStream to iterate over unsorted section
            IntStream.range(0, n - i - 1)
                     .forEach(j -> {
                         if (array[j] > array[j + 1]) {
                             // Swap array[j] and array[j + 1]
                             int temp = array[j];
                             array[j] = array[j + 1];
                             array[j + 1] = temp;
                         }
                     });
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted array: " + Arrays.toString(array));

        bubbleSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
