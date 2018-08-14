package amazon;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> stack2;
    int min;
    public static void main(String[] args) {

        MinStack min = new MinStack();
            min.push(2);
            min.push(3);
        min.push(1);
        System.out.println(min.stack);
        System.out.println(min.getMin());
        min.pop();
        System.out.println(min.stack);
        System.out.println(min.getMin());

        System.out.println(min.stack);


    }




    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        stack2 = new Stack<>();

        min = Integer.MAX_VALUE;
    }

    public  void push(int x) {

        if(x < min){
            min =x;
        }
        stack.push(x);

    }

    public  void pop() {

        int temp = stack.pop();
        System.out.println("temp " +  temp );
        if(temp == min){
            min = Integer.MAX_VALUE;
            while(!stack.empty()){
                int temp2 = stack.pop();
                if(min > temp2){
                    min = temp2;
                }
                stack2.push(temp2);
            }
            while(!stack2.empty()){
                stack.push(stack2.pop());
            }

        }
    }

    public  int top() {

       return stack.peek();
    }

    public  int getMin() {
       return min;
    }
}
