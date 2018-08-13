package amazon;

//Write a program to find the node at which the intersection of two singly linked lists begins.
//
//
//        For example, the following two linked lists:
//                     1   2
//        A:          a1 → a2
//                            ↘6    7    8
//                             c1 → c2 → c3
//                3    4    5 ↗
//        B:     b1 → b2 → b3
//        begin to intersect at node c1.

public class IntersectionOfListNodes {


    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);

        ListNode b1 = new ListNode(3);
        ListNode b2 = new ListNode(4);
        ListNode b3 = new ListNode(5);

        ListNode c1 = new ListNode(6);
        ListNode c2 = new ListNode(7);
        ListNode c3 = new ListNode(8);

        a1.next = a2;
        a2.next = c1;

        c1.next = c2;
        c2.next = c3;

        b1.next = b2;
        b2.next = b3;
        b3.next = c1;

        System.out.println(getIntersectionNode(a1, b1).val);

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {


        ListNode result = null;

        int curALen = getLength(headA);
        int curBLen = getLength(headB);

       // System.out.println(curALen);
       // System.out.println(curBLen);

        ListNode currentA = headA;
        ListNode currentB = headB;
        int diff =0;
        if(curALen > curBLen){
            diff = curALen - curBLen;
            System.out.println(diff);
            currentA = shiftNode(headA, diff);

        }else if(curBLen > curALen) {
            diff = curBLen - curALen;
            System.out.println(diff);
            currentB = shiftNode(headB , diff);
        }



        while(currentA != null && currentB != null){
            //System.out.println(currentA.val + "   " +currentB.val);


            if(currentA == currentB){
                result = currentA;
                return result;

            } else{
                currentA = currentA.next;
                currentB = currentB.next;
            }

        }
        return result;
    }

    public static int getLength(ListNode node){
        ListNode current = node;
        int count =0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public static  ListNode shiftNode(ListNode node , int interval){

        while (interval >0){
            interval--;
            node = node.next;
           //  System.out.println("knock out  "+node.val);


        }
        return node;
    }
}
