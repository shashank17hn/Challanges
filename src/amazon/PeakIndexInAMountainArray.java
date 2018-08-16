package amazon;

/*Let's call an array A a mountain if the following properties hold:

        A.length >= 3
        There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
        Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].

        Example 1:

        Input: [0,1,0]
        Output: 1
        Example 2:

        Input: [0,2,1,0]
        Output: 1*/

public class PeakIndexInAMountainArray {

    public static void main(String[] args) {

        int[] arr = {0,1,0};
        int[] arr2 = {0,2,1,0};

        System.out.println(peakIndexInMountainArray(arr));


        System.out.println(peakIndexInMountainArray(arr));


    }

    public static int peakIndexInMountainArray(int[] a) {

        int result =0;
        for(int i=1; i< a.length-1 ; i++){
            if(a[i] > a[i-1] && a[i] > a[i+1]){

                result =i;

            }
        }
        return result;
    }
}
