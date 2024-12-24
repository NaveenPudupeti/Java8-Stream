package java8StreamProgram;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringStream {
	public static void main(String[] args) {
		
		//String input ="Hello,World!";
		Scanner str = new Scanner(System.in);
		System.out.println("Enter your String:");
		String input = str.next();
		
		String reversed = IntStream.range(0,input.length())
				.mapToObj(i -> input.charAt(input.length() -i-1))
				.map(String::valueOf)
				.collect(Collectors.joining());
		
		System.out.println("Original String:"+input);
		System.out.println("reversed String:"+reversed);
				
	}

}
/*
 IntStream.range(0, input.length()):

Creates a stream of indices from 0 to the length of the string.
.mapToObj(i -> input.charAt(input.length() - i - 1)):

Maps each index to the corresponding character in reverse order.
.map(String::valueOf):

Converts each character to a String.
.collect(Collectors.joining()):

Joins all the characters into a single string.
 */
