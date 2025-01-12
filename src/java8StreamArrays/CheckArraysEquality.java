package java8StreamArrays;

import java.util.Arrays;

public class CheckArraysEquality {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};

        // Check if arrays are equal
        boolean areEqual = Arrays.equals(array1, array2);

        System.out.println("Are arrays equal? " + areEqual);
    }
}
