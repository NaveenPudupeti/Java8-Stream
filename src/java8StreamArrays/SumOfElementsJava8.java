package java8StreamArrays;
import java.util.Arrays;

public class SumOfElementsJava8 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Calculate sum using streams
        int sum = Arrays.stream(array).sum();

        System.out.println("Sum of elements: " + sum);
    }
}
