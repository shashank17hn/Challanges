package amazon;

/*Given a string, find the length of the longest substring without repeating characters.

        Example 1:

        Input: "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", which the length is 3.
        Example 2:

        Input: "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.

        Input: "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
                     Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


        Input: "dvdf"
        Output: 3


        */


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongSubsWORepChar {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {

        if(s.length() >0) {
            char[] arr = s.toCharArray();
            Map<Character,Integer> map = new HashMap<>();
            int max = Integer.MIN_VALUE;
            int i = 0;
            while (i < arr.length) {
                //  System.out.println(arr[i]);
                if (map.containsKey(arr[i])) {
                    i = map.get(arr[i]);
                  //    System.out.println("remove");
                    map.clear();
                } else {
                    map.put(arr[i], i);
                     //  System.out.println(map);
                    if (max < map.size()) {
                        max = map.size();
                    }
                }
                i++;
            }
            return max;
        }
        else
            return 0;



    }
}
