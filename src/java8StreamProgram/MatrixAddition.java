package java8StreamProgram;

import java.util.Arrays;

public class MatrixAddition {

    public static void main(String[] args) {
        // Example matrices (2x3 matrices)
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] matrix2 = {
            {7, 8, 9},
            {10, 11, 12}
        };
        
        // Check if both matrices have the same dimensions
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices must have the same dimensions for addition.");
            return;
        }
        
        // Add matrices using Java 8 Stream API
        int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];
        
        for (int i = 0; i < matrix1.length; i++) {
            resultMatrix[i] = 
                Arrays.stream(matrix1[i])  // Stream of the row from matrix1
                      .map((num, index) -> num + matrix2[i][index]) // Adding corresponding elements from matrix2
                      .toArray(); // Convert the stream back to an array
        }
        
        // Display the result matrix
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

