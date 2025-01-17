package java8StreamNumberPrograms;
import java.util.Arrays;

public class SwapNumbersStreams {

    public static void main(String[] args) {
        int[] numbers = {5, 10};

        System.out.println("Before Swapping: num1 = " + numbers[0] + ", num2 = " + numbers[1]);

        // Swap using streams
        numbers = Arrays.stream(numbers)
                        .boxed()
                        .sorted((a, b) -> b - a) // Sort in descending order to swap
                        .mapToInt(Integer::intValue)
                        .toArray();

        System.out.println("After Swapping: num1 = " + numbers[0] + ", num2 = " + numbers[1]);
    }
}
