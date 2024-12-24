package java8StreamProgram;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int num = 153;
		int digits = String.valueOf(num).length();
		int sum = String.valueOf(num).chars()
				.map(ch ->(int)Math.pow(Character.getNumericValue(ch), digits))
				.sum();
		System.out.println("Is ArmStrong number:"+""+(sum==num));
	

	}

}
