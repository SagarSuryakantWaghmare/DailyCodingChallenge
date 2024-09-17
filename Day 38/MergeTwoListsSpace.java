

public class MergeTwoListsSpace {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            next = null;
        }
    }
    public static ListNode mergeTwoListsSpace(ListNode list1,ListNode list2){
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=new ListNode(100);
        ListNode temp=head;
        while (temp1!=null&& temp2!=null) {
           if(temp1.val<temp2.val){
            ListNode a=new ListNode(temp1.val);
            temp.next=a;
            temp=a;
            temp1=temp1.next;
           } 
           else{
            ListNode a=new ListNode(temp2.val);
            temp.next=a;
            temp=a;
            temp2=temp2.next;
           }
        }
        if(temp1==null){
            temp.next=temp2;
        }
        else{
            temp.next=temp1;
        }
        return head.next;
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
        ListNode mergedHead = mergeTwoListsSpace(headA, headB);

        // Print the merged linked list
        ListNode current = mergedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
    
}
