/**
 * Definition for singly-linked list.
 */
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

/**
 * SwapPairs
 */
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode curr = head;
        ListNode prev = temp;

        // Swap all the nodes in pairs
        while (curr != null && curr.next != null) {
            ListNode firstNode = curr;
            ListNode secondNode = curr.next;

            // Here we swap the nodes
            prev.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            // Move to the next pair
            prev = firstNode;
            curr = firstNode.next;
        }
        return temp.next;
    }

    public static void main(String[] args) {
        // Create a sample linked list 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Print the original linked list
        System.out.println("Original Linked List:");
        printList(head);

        // Swap the pairs
        SwapPairs sp = new SwapPairs();
        ListNode swappedHead = sp.swapPairs(head);

        // Print the swapped linked list
        System.out.println("Linked List after swapping pairs:");
        printList(swappedHead);
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
