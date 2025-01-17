package java8StreamSearchingAndSorting;

import java.util.stream.IntStream;

public class FindMissingNumber {

    // Method to find the missing number
    public int findMissingNumber(int[] array) {
        int n = array.length + 1;  // n + 1 is the total number of elements expected

        // Calculate expected sum from 1 to n + 1 using the sum formula
        int expectedSum = (n * (n + 1)) / 2;

        // Calculate actual sum of elements in the array using IntStream
        int actualSum = IntStream.of(array).sum();

        // The difference is the missing number
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        FindMissingNumber finder = new FindMissingNumber();

        // Example array: Numbers from 1 to 6 but missing 4
        int[] array = {1, 2, 3, 5, 6};

        int missingNumber = finder.findMissingNumber(array);
        System.out.println("The missing number is: " + missingNumber);
    }
}
