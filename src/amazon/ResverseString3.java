package amazon;


/*
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

        Example 1:
        Input: "Let's take LeetCode contest"
        Output: "s'teL ekat edoCteeL tsetnoc"
*/

import java.util.Arrays;

public class ResverseString3 {


    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }


    public static String reverseWords(String s) {

        String[] words = s.split(" ");
        String result = "";
        Arrays.stream(words).forEach(e-> System.out.println(e));
        for(int i=0 ; i< words.length ;i++){
            StringBuilder sb = new StringBuilder();
            sb.append(words[i]);
            result += sb.reverse().toString() + " ";
        }


        return result.trim();
    }
}
