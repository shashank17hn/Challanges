package amazon;
/*Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(firstUniqChar("leetcode"));
		System.out.println(firstUniqChar("loveleetcode"));
		System.out.println(betterFirstUniqChar("loveleetcode"));
	}
	
	// ---------- normal approach - naive ----
	
	public static Map<Character, Integer> getMap(String str){
		Map<Character, Integer> map = new HashMap<>();
		if(str.length() > 0) {
			char[] arr = str.toCharArray();
			for(int i=0; i<arr.length ; i++) {
				if(map.containsKey(arr[i])) {
					map.put(arr[i], map.get(arr[i])+1);
				}else {
					map.put(arr[i], 1);
				}
				
			}
		}
		return map;
	}

	 public static int firstUniqChar(String s) {
	     
		 int result = -1;
		 if(s.length()> 0) {
			 Map<Character, Integer> map =  getMap(s);
			 char[] arr = s.toCharArray(); 
			 for(int i=0 ; i<arr.length ; i++) {
				 if(map.containsKey(arr[i])) {
					 if(map.get(arr[i]) ==1) {
						 result = i;
						 break;
					 }
				 }
			 }
		 }
		 return result;
		  
	    }
	 
	 
	 // --------- better approach ------ 
	 public static int betterFirstUniqChar(String s) {
	     
		 int result = -1;
		 if(s.length()> 0) {
			 Map<Character, Integer> map =  new LinkedHashMap<>();
			 Set<Character> set = new HashSet<>(); 
			 char[] arr = s.toCharArray(); 
			 for(int i=0 ; i<arr.length ; i++) {
				if(set.contains(arr[i])) {
					if(map.containsKey(arr[i]))
					map.remove(arr[i]);    
				}else {
					set.add(arr[i]);       
					map.put(arr[i], i);    
				}
			 }
			 result = map.size()!=0 ? map.entrySet().iterator().next().getValue() : -1;
		 }
		 return result;
		  
	    }
	 
	 
	 
	 
}
