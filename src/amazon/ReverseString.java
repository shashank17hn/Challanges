package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("hello"));
		System.out.println(betterReverseString("hello"));

	}
	// recursive approach but eventually turns out to be stack flow error
    public static String reverseString(String s) {
	       
    	String res ="";
    	List<Character> list = new ArrayList<>();
    	if(s.length() != 0) {
    		char[] arr = s.toCharArray();  
    		list.addAll(reverseStringUtils(arr , arr.length/2 +1, arr.length-1));
    		list.addAll(reverseStringUtils(arr , 0 , arr.length/2));
    		                                
    	}
    	
    	/* StringBuilder builder = new StringBuilder(list.size());
    	    for(Character ch: list)
    	    {
    	        builder.append(ch);
    	    }
    	    return builder.toString();*/
    	 res = list.stream().map(e->e.toString()).collect(Collectors.joining());
    	return res;
	}
    
    public static List<Character> reverseStringUtils(char [] arr ,int start , int end) {
	    
    	List<Character> list = new ArrayList<>();
    	String res ="";
    	if(end-start > 1) {
    		list.addAll(reverseStringUtils(arr , start+end/2+1 , end));
     		list.addAll(reverseStringUtils(arr , start , start+end/2));
    		
    	}
    	if(end-start==1) {
    		list.add(arr[end]);
    		list.add(arr[start]);
    	}
    	if(end-start==0) {
    		list.add(arr[start]);
    	}
    	return list;
	}
    
    // better approach - better performance 

    public static String betterReverseString(String s) {
    	String res= "";
    	if(s.length() != 0) {
    		char[] arr = s.toCharArray();
    		for(int i=0 ; i< arr.length/2 ; i++) {
    			char temp = arr[i];
    			arr[i] = arr[arr.length-1-i];
    			arr[arr.length-1-i] = temp;
    		}
    		String test = new String(arr);
    		res += test;
    		
    	}
    	return res;
    }
}
