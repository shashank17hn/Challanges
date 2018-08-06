package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*Example:
Given an input string , reverse the string word by word. 
Input:  ["t","h","e"," ","s","k","y"," ","i","s"," ","b","l","u","e"]
Output: ["b","l","u","e"," ","i","s"," ","s","k","y"," ","t","h","e"]*/


public class ReverseWord {
	
	static char str[] = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseWords();
		System.out.println(Arrays.toString(str));
		

	}
	
	 public static void reverseWords() {
	    reverseString(0, str.length);
	 //   System.out.println("test "+ Arrays.toString(str));
	    int start =0;
	     for(int i =0 ; i< str.length ; i++) {
	    	 if(str[i] == ' ' || i == str.length-1) {
	    		 System.out.println(start + " "  + i);
	    		 if(i == str.length-1 ) { 
	    			 i =str.length;
	    		 }
	    		 reverseString(start, i);
	    		 System.out.println("test 2"+ Arrays.toString(str));
	    		 start= i+1;
	    	 }
	     }
	        
	 }
	 
	 public static void reverseString(int start , int end ) {
		 if(start != end) {
			 int endt = end-1;
			 for(int i= start ; i < (start+end)/2 ; i++) {
				 char temp = str[i]; 
				 str[i] = str[endt];
				 str[endt] = temp;
				 endt--;
			 }
		 }
		 
	 }
}
