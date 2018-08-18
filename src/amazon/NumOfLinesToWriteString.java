package amazon;

/*Example :
        Input:
        widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
        S = "bbbcccdddaaa"
        Output: [2, 4]
        Explanation:
        All letters except 'a' have the same length of 10, and
        "bbbcccdddaa" will cover 9 * 10 + 2 * 4 = 98 units.
        For the last 'a', it is written on the second line because
        there is only 2 units left in the first line.
        So the answer is 2 lines, plus 4 units in the second line.*/

import java.util.Arrays;

public class NumOfLinesToWriteString {

    public static void main(String[] args) {

        int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "bbbcccdddaaa";
        int[] result = numberOfLines(widths,s);
        Arrays.stream(result).forEach(e-> System.out.println(e));

    }

    public static int[] numberOfLines(int[] widths, String s) {
        int counter =0;
        int limit = 100;
        int page=1;
        for(int i =0 ; i<s.length() ; i++){
           // System.out.println((int)s.charAt(i)-97);

             int val =  widths[(int)s.charAt(i)-97];
             if(counter+val <= limit){
                 counter += val;
                 System.out.println(counter);
             }else{
                 page++;
                 counter=0;
                 counter= +val;
                // System.out.println("reset"+ counter + s.charAt(i)) ;
             }
        }
        int[] result = {page, counter};
        return result;

    }

}
