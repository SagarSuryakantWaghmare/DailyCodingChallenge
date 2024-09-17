// package Day 38;
// leetcode 21:merge two lists

public class mergeTwoLists {
   

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            next = null;
        }
    }
    // without using the extra spaces
    public static ListNode mergeTwoLists(ListNode list1,ListNode list2){
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode h=new ListNode(100);
        ListNode t=h;  //for pointing the edge
        while (t1!=null&& t2!=null) {
            if(t1.val<t2.val){
                t.next=t1;
                t=t1;
                t1=t1.next;
            }
            else{
                t.next=t2;
                t=t2;
                t2=t2.next;
            }
        }
        if(t1==null){
            t.next=t2;
        }
        else{
            t.next=t1;
        }
        return h.next;
        
    }
    public static void main(String[] args) {
        // Create two linked lists
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(3);
        headA.next.next = new ListNode(4);
        headA.next.next.next = new ListNode(5);
        headA.next.next.next.next = new ListNode(12);
        headA.next.next.next.next.next = new ListNode(20);

        ListNode headB = new ListNode(0);
        headB.next = new ListNode(7);
        headB.next.next = new ListNode(8);
        headB.next.next.next = new ListNode(10);
        headB.next.next.next.next = new ListNode(24);

        // Merge the two lists
        ListNode mergedHead = mergeTwoLists(headA, headB);

        // Print the merged linked list
        ListNode current = mergedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
    

 
}
