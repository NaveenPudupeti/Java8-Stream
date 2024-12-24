package java8StreamProgram;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindromeCheck {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter your Palindrome String:");
        String in = input.next();
        
        boolean isPalindrome = IntStream.range(0, in.length() / 2)
                .allMatch(i -> in.charAt(i) == in.charAt(in.length() - i - 1));
        
        System.out.println("Is the string \"" + in + "\" a palindrome? " + isPalindrome);
    }
}

/*
 * IntStream.range(0, input.length() / 2):

Generates a range of integers from 0 to the middle index of the string.

input.charAt(i) == input.charAt(input.length() - i - 1):

Compares characters from the beginning and the end of the string.
allMatch:

Ensures that all comparisons return true. If even one character does not match, it returns false.
 */
