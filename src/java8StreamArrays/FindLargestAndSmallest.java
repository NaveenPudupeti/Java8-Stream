package java8StreamArrays;

import java.util.Arrays;
import java.util.Optional;

public class FindLargestAndSmallest {

	public static void main(String[] args) {

		int[] arr = {1,10,11,20,22,30,33,40,44,50,55,60,66,70};
		
		FindLargestAndSmallest(arr);
	}

	public static void FindLargestAndSmallest(int[] arr) {
  
		Optional<Integer> min =Arrays.stream(arr)
				.boxed()
				. min(Integer::compareTo);
		
		Optional<Integer> max = Arrays.stream(arr)
				.boxed()
				.max(Integer::compareTo);
		
		
		min.ifPresent(minValue -> System.out.println("SmallestValue:"+minValue));
		
		max.ifPresent(maxValue -> System.out.println("LargestValue:"+maxValue));
		
				
	}

}
