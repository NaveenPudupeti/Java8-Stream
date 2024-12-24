package java8StreamProgram;

import java.util.Scanner;
import java.util.stream.Stream;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//int limit = 10;
		System.out.println("Enter your limits:");
		int limit=in.nextInt();
		
		Stream.iterate(new long[] {0,1}, fib -> new long[] {fib[1],fib[0]+fib[1]})
		 .limit(limit)
		 .map(n->n[0])
		 .forEach(System.out::println);
	
	
	}

}

/*
Stream.iterate(new long[]{0, 1}, fib -> new long[]{fib[1], fib[0] + fib[1]}):

Starts with an initial pair {0, 1} representing the first two Fibonacci numbers.

Produces the next pair by summing the two numbers: {previous_second, previous_first + previous_second}.
.limit(limit):

Limits the stream to the desired number of Fibonacci numbers.
.map(n -> n[0]):

Extracts the first number in each pair, which corresponds to the Fibonacci sequence.
.forEach(System.out::println):

Prints each number in the sequence.
*/