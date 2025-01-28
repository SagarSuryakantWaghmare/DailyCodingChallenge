import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1); // Dummy node
        ListNode temp = head;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int x = (l1 != null) ? l1.val : 0; // Value of the first list node
            int y = (l2 != null) ? l2.val : 0; // Value of the second list node

            int sum = x + y + carry; // Add the values with carry
            carry = sum / 10;       // Update carry
            temp.next = new ListNode(sum % 10); // Create a new node for the sum

            temp = temp.next; // Move to the next node
            if (l1 != null) l1 = l1.next; // Advance l1
            if (l2 != null) l2 = l2.next; // Advance l2
        }

        return head.next; // Skip the dummy node
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Example: Add two numbers represented by linked lists
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3))); // 342
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4))); // 465

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2); // Expected result: 807 (7 -> 0 -> 8)

        printList(result);
    }
}
