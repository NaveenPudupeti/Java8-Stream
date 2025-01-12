package java8StreamArrays;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};  // Missing number is 3
        int n = array.length + 1;  // Array should have numbers from 1 to N (N=6 here)

        // Calculate expected sum from 1 to N using formula: N * (N + 1) / 2
        int expectedSum = n * (n + 1) / 2;

        // Calculate actual sum of elements in the array using streams
        int actualSum = Arrays.stream(array).sum();

        // Missing number is the difference
        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number: " + missingNumber);
    }
}
