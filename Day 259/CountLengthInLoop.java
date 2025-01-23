import java.util.LinkedList;

public class CountLengthInLoop {
    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }

    public static int countNodes(ListNode head) {
        ListNode curr = head;
        int length = 0;
        do {
            length++;
            curr = curr.next;
        } while (curr != head);
        return length;
    }

    public static int count(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return countNodes(slow);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode forth = new ListNode(5);
        ListNode fifth = new ListNode(6);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = third; // Creating a loop here
        System.out.println("Total length of the linked list is " + count(head));
    }
}