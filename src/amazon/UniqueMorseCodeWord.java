package amazon;
/*
[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]

        Example:
        Input: words = ["gin", "zen", "gig", "msg"]
        Output: 2
        Explanation:
        The transformation of each word is:
        "gin" -> "--...-."
        "zen" -> "--...-."
        "gig" -> "--...--."
        "msg" -> "--...--."*/


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWord {

    static HashMap<Character, String> map = new HashMap<>();
    static String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};


    public static void main(String[] args) {

       String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations2(words));


    }

    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        if(map.size() <  25)
            createMap();
        for(int i=0 ; i< words.length ; i++){
            String temp= "";
            for(int j=0 ; j< words[i].trim().length() ;j++){
               // System.out.println(words[i]);
                char ch = words[i].toLowerCase().charAt(j);
                //System.out.println(ch);
                if(map.containsKey(ch)){
                    temp += map.get(ch);
                }
            }
            set.add(temp);

        }
       return set.size();
    }

    public static void createMap()
    {
        int temp =97;
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(char i = 0 ; i < arr.length ; i++ ) {
            map.put((char) (temp + i), arr[i]);
        }
    }

    public static int uniqueMorseRepresentations2(String[] words){
        Set<String> set = new HashSet<>();

        for(int i=0 ; i< words.length ; i++){
            String temp= "";
            for(int j=0 ; j< words[i].trim().length() ;j++){
                // System.out.println(words[i]);
                char ch = words[i].toLowerCase().charAt(j);
                //System.out.println(ch);
               // System.out.println(97-(int)ch);
                    temp += morse[Math.abs(97-(int)ch)];

            }
            set.add(temp);

        }
        return set.size();

    }
}
