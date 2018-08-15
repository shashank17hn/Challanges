package amazon;

/*

Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

        Example:

        Input:  [1,2,3,4]
        Output: [24,12,8,6]
        Note: Please solve it without division and in O(n).

        Follow up:
        Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)


*/

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
       int input[] = {1,2,3,4};
     //  product(input);
        product2(input);
    }

    public static void product(int arr[]){
        int prod=1;
        for(int i =0 ; i< arr.length; i++){
            prod = prod * arr[i];

        }
      //  System.out.println(prod);

        for(int i=0 ; i< arr.length; i++){
            arr[i] = prod/arr[i];
        }

        Arrays.stream(arr).forEach(e -> System.out.println(e));

    }

    public static void product2( int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) result[i] = 1;
        int left = 1, right = 1;
        for (int i = 0, j = nums.length - 1; i < nums.length - 1; i++, j--) {
            left *= nums[i];
            System.out.println("left " + left);
            right *= nums[j];
            System.out.println("right " + right);
            result[i + 1] *= left;
            System.out.println("result[i + 1] " + result[i + 1]  + " " + (i+1));
            result[j - 1] *= right;
            System.out.println("result[j - 1] " + result[j - 1] + " " + (j-1));
        }
        Arrays.stream(result).forEach(e -> System.out.println(e));
    }

}
