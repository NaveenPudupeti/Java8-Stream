package java8StreamProgram;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		//int num = 153;
		Scanner n = new Scanner(System.in);             //1^3+5^3+3^3 = 153
		System.out.println("Enter your number:");
		int num = n.nextInt();
		int digits = String.valueOf(num).length();
		int sum = String.valueOf(num).chars()
				.map(ch ->(int)Math.pow(Character.getNumericValue(ch), digits))
				.sum();
		System.out.println("Is ArmStrong number:"+""+(sum==num));
	

	}

}
