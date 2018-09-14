package amazon;



/*Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.*/

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"flower","flow","flight"};
		String[] arr2 = {"dog","racecar","car"};
		String[] arr3 = {};
		String[] arr4 = {"a","b"};
		String[] arr5 = {"aa","a"};
		System.out.println(longestCommonPrefix(arr));
		System.out.println(longestCommonPrefix(arr2));
		System.out.println(longestCommonPrefix(arr4));
		System.out.println(longestCommonPrefix(arr5));
		
	}
	
	
	 public static String longestCommonPrefix(String[] strs) {
		 
		 StringBuilder sb = new StringBuilder();
		 if(strs.length !=0) {
			 sb.append(strs[0]);
			 
			 for(int i=1 ; i< strs.length ; i++) {
				
				// System.out.println(sb.toString());
				 String temp = longestCommonPrefixUtils(sb.toString() , strs[i]);
				  System.out.println(temp);
				 sb.replace(0, sb.length(), temp);
		 
			 }
		 }
	        return sb.toString();
	    }
	 
	 public static String longestCommonPrefixUtils(String s1 , String s2) {
		// System.out.println(s1 + " " +  s2);
		 int j=0;
		 String temp ="";
		 if(s1.length()!= 0 && s2.length() !=0) {
			 while(j < s1.length() && j < s2.length()) {
				 if(s1.charAt(j) ==  s2.charAt(j)) {
					 temp += s1.charAt(j);
					// System.out.println(" temp " + temp);
				 }else {
					 return temp;
				 }
				 j++;
			 }
		 }
		 return temp;
	 }

}
