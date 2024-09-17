public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if (head == null) return head;
       ListNode temp = new ListNode(0);
       temp.next = head;
       ListNode slow = temp;
       ListNode fast = temp;
       for (int i = 0; i < n; i++) {
          slow = slow.next;
       }
       if (slow.next == null) return head.next;
       while (slow.next != null) {
          slow = slow.next;
          fast = fast.next;
       }
       fast.next = fast.next.next;
       return head;
    }
 
    public static void main(String[] args) {
       // Creating the linked list 1->2->3->4->5
       ListNode head = new ListNode(1);
       head.next = new ListNode(2);
       head.next.next = new ListNode(3);
       head.next.next.next = new ListNode(4);
       head.next.next.next.next = new ListNode(5);
 
       RemoveNthNodeFromEndofList solution = new RemoveNthNodeFromEndofList();
 
       // Removing the 2nd node from the end, expected list: 1->2->3->5
       ListNode updatedHead = solution.removeNthFromEnd(head, 2);
 
       // Print the updated list
       printList(updatedHead);
    }
 
    // Helper method to print the linked list
    public static void printList(ListNode head) {
       ListNode current = head;
       while (current != null) {
          System.out.print(current.val + " ");
          current = current.next;
       }
       System.out.println();
    }
 }
 
 // Definition for singly-linked list.
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
 