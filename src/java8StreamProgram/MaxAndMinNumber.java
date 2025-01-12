package java8StreamProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Integer max = numbers.stream()
				     
				     .max(Comparator.naturalOrder())
				     .orElseThrow(() -> new IllegalArgumentException("List is empty:"));
                         
		
        Integer min =numbers.stream()
        		
        		.min(Comparator.naturalOrder())
               
        		.orElseThrow(()-> new IllegalArgumentException("List is empty:"));
        
        System.out.println(max);
        System.out.println(min);
	}

}
