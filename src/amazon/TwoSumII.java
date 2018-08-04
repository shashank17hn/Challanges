package amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoSumII {
	
//	Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a 		specific target number.
//	Input: numbers = [2,7,11,15], target = 9
//	Output: [1,2]
//	Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {2,7,11,15};
		
		int result[] =getNumbers(numbers, 9);
		Arrays.stream(result).forEach(e -> System.out.println(e));
		
		int[] result2 = getNumberindex(numbers, 9);
		if(result2 != null) {
			Arrays.stream(result2).forEach(e -> System.out.println(e));
		}
		

	}
	
	public static int[] getNumbers(int[] arr , int num) {
		
//		// To boxed array
//		Integer[] what = Arrays.stream( data ).boxed().toArray( Integer[]::new );
//		Integer[] ever = IntStream.of( data ).boxed().toArray( Integer[]::new );
//
//		// To boxed list
//		List<Integer> you  = Arrays.stream( data ).boxed().collect( Collectors.toList() );
//		List<Integer> like = IntStream.of( data ).boxed().collect( Collectors.toList() );
		int output[] = new int[2];
		Set<Integer> set = new LinkedHashSet<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
		for(int i=0 ; i<arr.length; i++) {
			if(set.contains(num - arr[i])){
				output[0] = arr[i];
				output[1] = num- arr[i];
				return output;
			}
		}
		return null;
		
	}
	
	public static int[] getNumberindex(int[] number, int target) {
		int[] result = null;
		if(number.length > 2) {
			Map<Integer, Integer> map = new HashMap<>();
			for(int i =0 ; i<number.length ; i++) {
				if(map.containsKey(number[i])) {
					result = new int[]{map.get(number[i])+1, i+1};
				}else {
					map.put(target -number[i], i);
					
				}
				
			}
			
		}
		return result;
		
	}

}
