package java8StreamNumberPrograms;

public class ReverseNumberUsingStreams {

    public static int reverseNumber(int number) {
        // Convert number to a string, then reverse using streams
        return Integer.parseInt(new StringBuilder(String.valueOf(Math.abs(number)))
                                .reverse()
                                .toString());
    }

    public static void main(String[] args) {
        int number = 12345;

        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
