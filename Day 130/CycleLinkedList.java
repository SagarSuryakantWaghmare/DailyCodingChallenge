/**
 * CycleLinkedList
 */
public class CycleLinkedList {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        
    }
    public boolean hasCycle(ListNode head){
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CycleLinkedList list = new CycleLinkedList();
        CycleLinkedList.ListNode head = list.new ListNode(3);
        head.next = list.new ListNode(2);
        head.next.next = list.new ListNode(0);
        head.next.next.next = head; // create a cycle
        System.out.println(list.hasCycle(head)); // true
    }
}