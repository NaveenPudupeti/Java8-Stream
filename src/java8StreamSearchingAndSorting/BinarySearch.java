package java8StreamSearchingAndSorting;

import java.util.Optional;

public class BinarySearch {

    // Binary search method: Recursive approach
    public Optional<Integer> binarySearchRecursive(int[] array, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is at mid
            if (array[mid] == target) {
                return Optional.of(mid);
            }

            // If target is smaller than mid, search the left half
            if (array[mid] > target) {
                return binarySearchRecursive(array, left, mid - 1, target);
            }

            // Else search the right half
            return binarySearchRecursive(array, mid + 1, right, target);
        }

        // If not found, return an empty Optional
        return Optional.empty();
    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};

        int target = 11;

        // Perform recursive binary search and print result
        search.binarySearchRecursive(sortedArray, 0, sortedArray.length - 1, target)
                .ifPresentOrElse(
                        index -> System.out.println("Target found at index: " + index),
                        () -> System.out.println("Target not found")
                );
    }
}
