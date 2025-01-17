package java8StreamNumberPrograms;

import java.util.stream.IntStream;

public class GCDUsingStreams {

    public static int findGCD(int num1, int num2) {
        return IntStream.rangeClosed(1, Math.min(num1, num2))
                .filter(i -> num1 % i == 0 && num2 % i == 0)  // Check divisors of both numbers
                .max()                                        // Get the maximum of common divisors
                .orElse(1);                                   // Default to 1 if no divisors found
    }

    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 98;

        int gcd = findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
