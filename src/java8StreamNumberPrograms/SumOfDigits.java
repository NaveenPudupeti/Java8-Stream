package java8StreamNumberPrograms;

import java.util.stream.IntStream;

public class SumOfDigits {

    public static int sumOfDigits(int number) {
        return String.valueOf(Math.abs(number))   // Convert number to String (handle negative numbers)
                     .chars()                      // Stream over each character
                     .map(Character::getNumericValue) // Convert each character to its numeric value
                     .sum();                       // Sum up the digits
    }

    public static void main(String[] args) {
        int number = 12345;

        int sum = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}
