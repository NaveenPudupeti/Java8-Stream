package java8StreamProgram;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {
	public static void main(String[] args) {
		//int number = 29;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter your number:");
		int number = num.nextInt();
		
		boolean isPrime = number > 1 &&
				IntStream.rangeClosed(2, (int)Math.sqrt(number))
				.noneMatch(i -> number% i ==0);
		
		System.out.println("Is"+number+"a number?"+isPrime);
		
	}

}

/*
IntStream.rangeClosed(2, (int) Math.sqrt(number)):

Generates a stream of integers from 2 to the square root of the number. This range is sufficient for checking primality.
.noneMatch(i -> number % i == 0):

Checks that none of the numbers in the range divide the target number evenly. If any number does, the target number is not prime.
number > 1:

Ensures the number is greater than 1, as 1 and smaller numbers are not prime.
Output:

The result is a boolean value indicating whether the number is prime.

*/