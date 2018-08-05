package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]*/

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3};
		List<List<Integer>> list = subsets(nums);
		//List<ArrayList<Integer>> list1 = subsets1(nums);
		System.out.println(list);
		
		//printSubsets(nums);
		//recSubset(nums);
		//System.out.println(list);
	//	System.out.println(0 & 1);
		//printSubsets(nums);

	}
	//static List<List<Integer>> list = new ArrayList<>();
	
	
	public static List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        
        Arrays.sort(S);
        for(int i : S) {
            List<List<Integer>> tmp = new ArrayList<>();
            for(List<Integer> sub : res) {
            	
            	System.out.println(" sub " + sub);
                List<Integer> a = new ArrayList<>(sub);
                
                a.add(i);
                System.out.println(" a " + a);
                
                tmp.add(a);
                System.out.println(" tmp " + tmp);
            }
            res.addAll(tmp);
        }
        return res;
    }
	/*
	public static void recSubset(int arr[]) {
		List<Integer> subset = new ArrayList<>();
		// Integer[] subset = new Integer[arr.length];
		recSubsetUtils(arr, subset, 0);
		
	}
	
	public static List<Integer> recSubsetUtils(int arr[] , List<Integer> subset , int i) {
		if(i == arr.length-1) {
			// Set<Integer> set = new HashSet<>(Arrays.asList(subset));
			List<Integer> temp = new ArrayList<>();
			temp.add(arr[i]);
		    list.add(temp);
		}else {
			
			List<Integer> temp = new ArrayList<>();
		    list.add(temp);
			// list.add(subset);
			list.add(recSubsetUtils(arr, temp, i+1));
			    subset.add(arr[i]);
			list.add(subset);
			list.addrecSubsetUtils(arr, subset, i+1);
		}
		
	}
	
	  public static void printSubArrays(int [] arrA){

	        int arrSize = arrA.length;
	        //start point
	        for (int startPoint = 0; startPoint <arrSize ; startPoint++) {
	            //group sizes   // 0 - 2
	            for (int grps = startPoint; grps <=arrSize ; grps++) {  // 0 - 2
	                //if start point = 1 then
	                //grp size = 1 , print 1
	                //grp size = 2, print 1 2
	                //grp size = 3, print 1 2 3 ans so on
	            	List<Integer> temp = new ArrayList<>();
	                for (int j = startPoint ; j < grps ; j++) {
	                	
	                	temp.add(arrA[j]);
	                    System.out.print(arrA[j] + " ");
	                }
	                list.add(temp);
	                System.out.println();
	            }
	        }
	        
	        System.out.println(list);
	    }
	
	

	 
	 public static ArrayList<ArrayList<Integer>> subsets1(int[] S) {
		 if (S == null)
			 return null;
		 //Arrays.sort(S);
		 ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		 	for (int i = 0; i < S.length; i++) {
		 			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
		 //get sets that are already in result
		 		//	System.out.println("result " + result);
		 			for (ArrayList<Integer> a : result) {
		 		//		System.out.println("test " + a);
		 				temp.add(new ArrayList<Integer>(a));
		 		//		System.out.println("temp " + temp);
		 			}
		 //add S[i] to existing sets
		 			for (ArrayList<Integer> a : temp) {
		 				
		 				a.add(S[i]);
		 				System.out.println("temp " + a);
		 			}
		 //add S[i] only as a set
		 			ArrayList<Integer> single = new ArrayList<Integer>();
		 			single.add(S[i]);
		 			temp.add(single);
		 			result.addAll(temp);
		 }
		 //add empty set
		 result.add(new ArrayList<Integer>());
		 return result;
		 }
	 
	 
	 
	  static void printSubsets(int set[])
	    {
	        int n = set.length;
	 
	        // Run a loop for printing all 2^n
	        // subsets one by obe
	        for (int i = 0; i < (1<<n); i++)
	        {
	            System.out.print("{ ");
	 
	            // Print current subset
	            for (int j = 0; j < n; j++)
	 
	                // (1<<j) is a number with jth bit 1
	                // so when we 'and' them with the
	                // subset number we get which numbers
	                // are present in the subset and which
	                // are not
	                if ((i & (1 << j)) > 0)  // 0 
	                	{
	                	//System.out.print("test "+ i +" "+ j+ " "+ (1<<j) +" "  + (i & (1 << j)) + "   ");
	                    System.out.print(set[j] + " ");
	                	}
	            System.out.println("}");
	        }
	    }*/
}
