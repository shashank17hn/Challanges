package amazon;

/*
Compare two version numbers version1 and version2.
        If version1 > version2 return 1; if version1 < version2 return -1;otherwise return 0.

        You may assume that the version strings are non-empty and contain only digits and the . character.
        The . character does not represent a decimal point and is used to separate number sequences.
        For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

        Example 1:

        Input: version1 = "0.1", version2 = "1.1"
        Output: -1
        Example 2:

        Input: version1 = "1.0.1", version2 = "1"
        Output: 1
        Example 3:

        Input: version1 = "7.5.2.4", version2 = "7.5.3"
        Output: -1
*/


import java.util.*;
import java.util.Arrays;

public class CompareVersionNumbers {
	
	public static void main(String[] args) {
		System.out.println(bettercompareVersion("0.1", "1.1"));
        System.out.println(bettercompareVersion("1.0.1", "1"));
        System.out.println(bettercompareVersion("7.5.2.4", "7.5.3"));
	}
	
	  public static int compareVersion(String version1, String version2) {

	       List <String> ver1 = new ArrayList<>();
           ver1.addAll(Arrays.asList(version1.split("\\.")));
           List <String> ver2 = new ArrayList<>();
           ver2.addAll(Arrays.asList(version2.split("\\.")));
	       int v1= 0 , v2 =0;

          //System.out.println("before" + ver1 + " "+ ver1.size());
          //System.out.println("before" + ver2 + " " + ver2.size()) ;

	       while(v1 < ver1.size() && v2 < ver2.size()){
	          // System.out.println(ver1.get(v1) + "   "+ ver2.get(v2));
	       		if(Integer.parseInt(ver1.get(v1)) > Integer.parseInt(ver2.get(v2))){
	       			return 1;
				}
				else if(Integer.parseInt(ver1.get(v1)) < Integer.parseInt(ver2.get(v2))){
                   return -1;
               }
                else if(Integer.parseInt(ver1.get(v1)) == Integer.parseInt(ver2.get(v2))){
                    if(v1 < ver1.size()-1 && v2 == ver2.size()-1){
                       // System.out.println("before" + ver2);
                        v1++;
                        v2++;
                        ver2.add("0");

                     //   System.out.println("add" +ver2);
                    }
                    else if(v2 < ver2.size()-1 && v1 == ver1.size()-1) {
                       // System.out.println("before v1" + ver2);
                        v2++;
                        v1++;
                        ver1.add("0");

                       // System.out.println("add v1" +ver2);
                    }
                    else if(v1 < ver1.size()-1 && v2 < ver2.size()-1){
                        v1++;
                        v2++;
                    }

               }
		   }
		   return 0;
	    }


    public static int bettercompareVersion(String version1, String version2) {


	    String[] ver1 = version1.split("\\.") ;
        String[] ver2 = version2.split("\\.") ;
        int length = Math.max(ver1.length , ver2.length);
       // Arrays.stream(ver1).forEach(e-> System.out.println(e));
	    for (int i=0 ; i<length ; i++){
	        Integer v1 = i < ver1.length ? Integer.parseInt(ver1[i]) : 0;
	        Integer v2 = i < ver2.length ? Integer.parseInt(ver2[i]) : 0;
	        int result = v1.compareTo(v2);
	         if(result !=0){
	             return result;
             }

        }
        return 0;
    }
}
