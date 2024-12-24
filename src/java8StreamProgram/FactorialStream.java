package java8StreamProgram;

import java.util.Scanner;
import java.util.stream.LongStream;

public class FactorialStream {

	public static void main(String[] args) {
		
		//int number = 5;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter your number");
		int number =num.nextInt();
		long factorial = LongStream.rangeClosed(1, number)
				.reduce(1, (a,b) -> a*b);
		System.out.println("Factorial of"+number+"is:"+factorial);

	}

}

/*
LongStream.rangeClosed(1, number):

Generates a stream of numbers from 1 to number (inclusive).
.reduce(1, (a, b) -> a * b):

Accumulates the product of the numbers in the stream.
The first argument, 1, is the identity for multiplication.
Result:

The result of the reduce operation is the factorial of the number.
*/