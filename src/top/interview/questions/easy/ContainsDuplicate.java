/*Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true
Example 2:

Input: [1,2,3,4]
Output: false
Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true*/


package top.interview.questions.easy;

import java.util.Arrays;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,1};
		System.out.println(containsDuplicate(arr));
		
		int[] arr2 = {1,2,3,4}; 
		System.out.println(containsDuplicate(arr2));

	}
	
    public static boolean containsDuplicate(int[] nums) {
    	
    	if(nums.length ==0)
    		return false;
    	
    	Arrays.sort(nums);
    	for(int i=0 ; i< nums.length-1 ; i++) {
    		if(nums[i] == nums[i+1]) {
    			return true;
    		}
    	}
    	return false;
        
    }

}
