import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode random;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            int randomVal = (temp.random != null) ? temp.random.val : -1;
            System.out.println("Node: " + temp.val + ", Random: " + randomVal);
            temp = temp.next;
        }
    }
    public static ListNode copyRandomList(ListNode head){
        // create a list in between
        ListNode temp=head;
        while (temp!=null) {
            ListNode copy=new ListNode(temp.val);
            copy.next=temp.next;
            temp.next=copy;
            temp=copy.next;
        }
        // Assign the random pointers
        temp=head;
        while (temp!=null) {
            if(temp.random!=null){
                temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }

        // extract the ll
        ListNode dummy=new ListNode(0);
        ListNode copy,copyTemp=dummy;
        temp=head;
        while (temp!=null) {
            copy=temp.next;
            temp.next=copy.next;
            copyTemp.next=copy;
            copyTemp=copy;
            temp=temp.next;


        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        head.next = new ListNode(13);
        head.next.next = new ListNode(11);
        head.next.next.next = new ListNode(10);
        head.next.next.next.next = new ListNode(1);
        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head;

        System.out.println("Original List:");
        printList(head);

        ListNode copiedHead = copyRandomList(head);
        System.out.println("\nCopied List:");
        printList(copiedHead);
    }
}
