package amazon;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfLinkedList {




    public static void main(String[] args) {
      //  [1,2,3,4,5]

        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);

        System.out.println(middleNode(root).val);
        System.out.println(middleNodeBetter(root).val);

    }

    public static ListNode middleNode(ListNode head) {

        ListNode current = head;
        List<ListNode> memo = new ArrayList<>();
        int length =0;
        while(current != null){
            memo.add(current);
            length++;
            current = current.next;

        }

       // memo.stream().forEach(e -> System.out.println(e.val));

      //  System.out.println(length);
        if(length%2 !=0){
            return memo.get(length/2);
        }else{
            return memo.get((length+1)/2);
        }

    }


    public static ListNode middleNodeBetter(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        while(fast!= null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;

        }
        return slow;

    }


}
