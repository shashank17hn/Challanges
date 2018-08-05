package amazon;

import java.util.LinkedList;
import java.util.Queue;

/*The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false*/


public class JudgeRouteCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "UD";
		System.out.println(judgeRoute(s));
		System.out.println(judgeRoute("RLUURDDDLU"));

	}
	
   public static boolean judgeRoute(String move) {
	   
	   int x =0 , y=0;
	   if(move.length() == 0) {
		   return true;
	   }
	   if(move.length() >= 2) {
		   char[] arr = move.toCharArray();
		   for(int i= 0; i< arr.length ; i++) {
			   switch(arr[i]) {
			   case 'L':{
				   x++;
				   break;
			   }
			   case 'R':{
				   x--;
				   break;
			   }
			   case 'U':{
				   y++;
				   break;
			   }
			   case 'D':{
				   y--;
				   break;
			   }
			   }
		   }
	   }
	   if(x== 0 && y ==0) {
		   return true;
	   }else return false;
	   
	   
   }

}
