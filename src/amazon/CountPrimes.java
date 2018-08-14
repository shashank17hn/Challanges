package amazon;

import java.util.HashMap;

public class CountPrimes {
static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {

       // initialize();
        System.out.println(primeCount(20));
       System.out.println(primeCount(13));
        System.out.println(primeCount(2));
        System.out.println(primeCount(0));
        System.out.println(primeCount(4));

    }

    public static int primeCount(int num){

        if (memo.size() ==0)
            initialize();

        int count =0;
        int max = 7;


        if(memo.containsKey(num)){
            return memo.get(num)-1;
        }else {
            if(num < max)
                max = num;
           else
               count += memo.get(max);
            for (int i = max; i <num; i++) {
               // System.out.println(i + " " + isPrime);
                if (prime(i)) {
                    System.out.println("is prime " + i);
                    count++;
                    System.out.println(i + " " + count);
                    memo.put(i, count);
                    max = num;
                }
            }

        }

        return count;
    }

    public static boolean prime(int i){

        boolean isPrime = true;
        if (i % 2 == 0) {
            isPrime = false;
        }
        if (i % 3 == 0) {
            isPrime = false;
        }
        if (i % 5 == 0) {
            isPrime = false;
        }
        if (i % 7 == 0) {
            isPrime = false;
        }
        return isPrime;
    }

    public static void initialize()
    {
        memo.put(0,1);
        memo.put(1,1);
        memo.put(2,1);
        memo.put(3,2);
       // memo.put(4,2);
        memo.put(5,3);
      //  memo.put(6,3);
        memo.put(7,4);

    }
}
