package java8StreamNumberPrograms;

import java.util.Arrays;

public class SwapNumbersStream {

    public static void main(String[] args) {
        int[] numbers = {15, 25};

        System.out.println("Before Swapping: num1 = " + numbers[0] + ", num2 = " + numbers[1]);

        numbers = Arrays.stream(numbers)
                        .boxed()
                        .sorted((a, b) -> b - a)  // Reverse sorting to swap
                        .mapToInt(Integer::intValue)
                        .toArray();

        System.out.println("After Swapping: num1 = " + numbers[0] + ", num2 = " + numbers[1]);
    }
}
