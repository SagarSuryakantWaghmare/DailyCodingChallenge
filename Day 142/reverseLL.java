public class reverseLL {
    public class ListNode {
        int val;
        ListNode next;

        // Constructor for a single node
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        // Constructor for a node with a next reference
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Method to reverse the linked list
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode after = null;
        ListNode prev = null;
        while (curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    // Method to print the linked list
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        reverseLL obj = new reverseLL();

        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode node5 = obj.new ListNode(5);
        ListNode node4 = obj.new ListNode(4, node5);
        ListNode node3 = obj.new ListNode(3, node4);
        ListNode node2 = obj.new ListNode(2, node3);
        ListNode head = obj.new ListNode(1, node2);

        System.out.println("Original List:");
        obj.printList(head);

        // Reversing the linked list
        ListNode reversedHead = obj.reverseList(head);

        System.out.println("Reversed List:");
        obj.printList(reversedHead);
    }
}
