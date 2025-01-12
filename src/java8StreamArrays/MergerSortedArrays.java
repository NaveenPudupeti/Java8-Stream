package java8StreamArrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergerSortedArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {1,3,5,7,9,};
		int[] arr2 = {2,4,6,8,10};
		
		int[] mergerSorted = MergerSortedArrays(arr1,arr2);
		
		System.out.println(Arrays.toString(mergerSorted));

	}

	public static int[] MergerSortedArrays(int[] arr1, int[] arr2) {

		return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
				
				.sorted()
				.toArray();
	}

}
