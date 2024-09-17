public class MergeTwoSortedLists {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode mergeTwoSorted(ListNode n1, ListNode n2) {
        ListNode t1 = n1;
        ListNode t2 = n2;
        ListNode temp = new ListNode(0); // Temporary node to start the merged list
        ListNode t = temp;
        
        // Merging the two sorted lists
        while (t1 != null && t2 != null) {
            if (t1.val < t2.val) {
                t.next = t1;
                t = t1;
                t1 = t1.next;
            } else {
                t.next = t2;
                t = t2;
                t2 = t2.next;
            }
        }

        // Append the remaining nodes
        if (t1 == null) {
            t.next = t2;
        } else {
            t.next = t1;
        }

        return temp.next; // Return the head of the merged list
    }

    public static void main(String[] args) {
        // Creating first sorted linked list: 1 -> 3 -> 5
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(3);
        n1.next.next = new ListNode(5);

        // Creating second sorted linked list: 2 -> 4 -> 6
        ListNode n2 = new ListNode(2);
        n2.next = new ListNode(4);
        n2.next.next = new ListNode(6);

        // Merging the two sorted linked lists
        ListNode mergedList = mergeTwoSorted(n1, n2);

        // Printing the merged linked list
        ListNode current = mergedList;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
