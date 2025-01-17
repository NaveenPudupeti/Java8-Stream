package java8StreamSearchingAndSorting;

import java.util.Arrays;
import java.util.Optional;

public class QuickSort {

    // QuickSort method
    public void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    // Partition method to rearrange elements based on pivot
    private int partition(int[] array, int low, int high) {
        int pivot = array[high];  // Choosing the last element as pivot
        int i = low - 1;          // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is less than or equal to pivot
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                swap(array, i, j);
            }
        }

        // Swap the pivot element with the element at i+1
        swap(array, i + 1, high);
        return i + 1;
    }

    // Swap two elements in an array
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Helper method to print the sorted array using Optional and Lambda
    public void printArray(int[] array) {
        Optional.ofNullable(array)
                .ifPresent(arr -> Arrays.stream(arr).forEach(val -> System.out.print(val + " ")));
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort sorter = new QuickSort();

        int[] array = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};

        System.out.println("Original Array:");
        sorter.printArray(array);

        sorter.quickSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        sorter.printArray(array);
    }
}
