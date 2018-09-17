package top.interview.questions.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/*Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
*/

public class IntersectionOfArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		
		
		//int[] nums1 = {4,9,5};
		//int[] nums2 = {9,4,9,8,4};
				
				
		int[] res = intersect(nums1, nums2);
		Arrays.stream(res).forEach(e -> System.out.println(e));

	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		List<Integer> list = new ArrayList<>();
		
		
		int index2 =0;
		int index1 =0;
		while(index2 < nums2.length && index1 < nums1.length) {
			
			System.out.println(nums1[index1] + "  : " + nums2[index2]);
			if(nums1[index1] ==  nums2[index2]) {
				list.add(nums2[index2]);
				index1++;
				index2++;
			}else if( index1 +1 < nums1.length && nums1[index1+1] <= nums2[index2]) {
				index1++;
			}else {
				//index1++;
				 index2++;
			}
			
		}
		
		int[] rest = list.stream().mapToInt(Integer :: intValue).toArray();
		return rest;
	    
    }

}
