public class MiddleListNode {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }
    public static void MiddleElement(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Middle Element of the linked list:"+slow.data);


    }

    public static void main(String[] args) {
        // Creating a ListNode list
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for (int i = 1; i < 10; i++) {
            ListNode node = new ListNode(i);
            temp.next = node;
            temp = node;
        }
        MiddleElement(head);
    }
}