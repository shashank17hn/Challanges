package amazon;

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000

        Example 1:

        Input: "III"
        Output: 3
        Example 2:

        Input: "IV"
        Output: 4
        Example 3:

        Input: "IX"
        Output: 9
        Example 4:

        Input: "LVIII"
        Output: 58
        Explanation: C = 100, L = 50, XXX = 30 and III = 3.
        Example 5:

        Input: "MCMXCIV"
        Output: 1994
        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*/

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {

        System.out.println(romanToInt("LVIII"));

    }

    public static int romanToInt(String s) {



        Map<Character, Integer> memo = new HashMap<>();
        memo.put('M', 1000);
        memo.put('D', 500);
        memo.put('C', 100);
        memo.put('L', 50);
        memo.put('X', 10);
        memo.put('V', 5);
        memo.put('I', 1);


        int num =0;
        int i =s.length()-1;
        while(i >=0){

            if(memo.containsKey(s.charAt(i))){

                if(i !=0 && memo.containsKey(s.charAt(i-1))){
                   if(memo.get(s.charAt(i)) > memo.get(s.charAt(i-1))){
                       num += memo.get(s.charAt(i))- memo.get(s.charAt(i-1));
                        i -= 2;
                   }
                   else {
                       num += memo.get(s.charAt(i));
                       i--;
                   }

                }
                else
                    {
                        num += memo.get(s.charAt(i));
                        i--;
                    }
            }

        }

        return num;

    }
}
