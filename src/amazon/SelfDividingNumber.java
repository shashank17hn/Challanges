package amazon;

/*A self-dividing number is a number that is divisible by every digit it contains.

        For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

        Also, a self-dividing number is not allowed to contain the digit zero.

        Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

        Example 1:
        Input:
        left = 1, right = 22
        Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]*/

import java.util.*;

public class SelfDividingNumber {

    static Set<Integer> memo = new HashSet<>();

    public static void main(String[] args) {

        System.out.println(selfDividingNumbers(1,22));

    }

    public static List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> result = new ArrayList<>();

        for(int i=left ; i<= right ; i++){
            if(memo.contains(i)) {
                result.add(i);
            }else {
                String temp = Integer.toString(i);
                if (!temp.contains("0")) {
                    if (temp.length() == 1) {
                        result.add(i);
                        memo.add(i);
                    } else {
                        inner:
                        for (int j = 0; j < temp.length(); j++) {
                           // System.out.println(i);
                           // System.out.println(temp.charAt(j));
                            //  System.out.println(Integer.parseInt(String.valueOf(temp.charAt(j))));

                            if (i % Integer.parseInt(String.valueOf(temp.charAt(j))) != 0) {
                                break inner;
                            } else if (j == temp.length() - 1) {
                                result.add(i);
                                memo.add(i);

                            }
                        }
                    }

                }
            }
        }

        return result;

    }
}
