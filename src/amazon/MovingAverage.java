package amazon;

/*Example:

        MovingAverage m = new MovingAverage(3);
        m.next(1) = 1
        m.next(10) = (1 + 10) / 2
        m.next(3) = (1 + 10 + 3) / 3
        m.next(5) = (10 + 3 + 5) / 3*/


import java.util.ArrayList;
import java.util.List;

public class MovingAverage {

    List<Integer> arr;
    int counter;
    int res;


    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        arr = new ArrayList<>();
    }

    public double next(int val) {
        counter++;
        res +=val;
       /* for(int i=0 ; i<counter;i++){
            res += arr.get(i);
        }*/
        return res/counter;
    }



/*
    ["MovingAverage","next","next","next","next"]
            [[3],[1],[10],[3],[5]]
    Output:
            [null,0.0,0.0,0.0,0.0]
    Expected:
            [null,1.0,5.5,4.66667,6.0]*/


    public static void main(String[] args) {
        MovingAverage mov = new MovingAverage(5);
        System.out.println(mov.next(3));
        System.out.println(mov.next(1));
        System.out.println(mov.next(10));
        System.out.println(mov.next(3));
        System.out.println(mov.next(5));
    }
}
