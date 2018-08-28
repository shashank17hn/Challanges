package amazon;

/*Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

        Example 1:

        Input: S = "loveleetcode", C = 'e'
        Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]*/


import java.util.*;

public class ShortestDistToChar {

    public static void main(String[] args) {

       int [] arr = shortestToCharBetter("loveleetcode" ,'e');
       // int [] arr = shortestToCharBetter("aaba" ,'b');
        Arrays.stream(arr).forEach(e-> System.out.print(e + " "));

    }

    public static int[] shortestToChar(String S, char C) {

        Set<Integer> set = new HashSet<>();
        char[] s = S.toCharArray();
        int[] pos = new int[s.length];
        set = getElementPos(s, C);

       // System.out.println(set);
               //     321010012210
       // Input: S = "loveleetco d e", C = 'e'
                  //  0123456789 10 11

        int last = Integer.MAX_VALUE;
        int temp = 0;
        for(int i=0; i<s.length ;i++){




            if(i > temp || i==0){
                temp +=1;
                while(!set.contains(temp)){
                    temp += 1;
                }
               // System.out.println("temp" + temp);
            }
            if(temp != i){
             //   System.out.println("last " +  last + " temp " +  temp);
                pos[i] = Math.min(Math.abs(last-i), temp-i);
             //   System.out.println(" pos " + s[i] +" ->"+  i + "  " + pos[i]);
            }
            if(temp == i){
                pos[i] = 0;
                last = temp;
              //  System.out.println(" pos i=i" +  i + "  " + pos[i]);
            }




        }

        return pos;

    }

    public static Set<Integer> getElementPos(char[] s , char C){
        Set<Integer> set = new HashSet<>();

        for(int i=0 ; i< s.length ; i++){
            if(s[i] == C){
                set.add(i);
            }
        }
        return set;
    }


    public static int[] shortestToCharBetter(String S, char C) {
                //     321010012210
        // Input: S = "loveleetco d e", C = 'e'
                     //0123456789 10 11

        char[] s = S.toCharArray();
        int[] arr = new int[s.length];
        int last = Integer.MAX_VALUE;
        int lastIndex = 0;
        for(int i=0 ; i< s.length ; i++){
           // System.out.println( " last " +  last + " i " + i +  " lastIndex " +  lastIndex +  " "+ s[i]);
            if(s[i] == C){
                for(int j= lastIndex ; j<= i ; j++){
                    arr[j]= Math.min(Math.abs(last-j), i-j);
                  //  System.out.println(arr[j]);
                }
                last= i;
                lastIndex= i+1;
            }
            else {
                arr[i]= Math.abs(last-i);
            }

        }

        return arr;

    }

}
