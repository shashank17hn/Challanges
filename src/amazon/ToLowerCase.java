package amazon;

/*Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.



        Example 1:

        Input: "Hello"
        Output: "hello"
        Example 2:

        Input: "here"
        Output: "here"
        Example 3:

        Input: "LOVELY"
        Output: "lovely"*/

public class ToLowerCase {

    public static void main(String[] args) {

        System.out.println(toLowerCase("Hello"));
    }

    public static String toLowerCase(String str) {

        char[] arr = str.toCharArray();
        for(int i=0 ; i< arr.length ; i++){
            int temp = arr[i];
            if(temp >=65 && temp <= 90){
                arr[i] = (char)(temp +32);
            }
        }

        return new String(arr);

    }
}
