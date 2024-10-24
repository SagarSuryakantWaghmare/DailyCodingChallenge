/**
 * PalindromeLinkedList
 */
public class PalindromeLinkedList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public static ListNode reverse(ListNode head){
    ListNode curr=head;
    ListNode next=null;
    ListNode prev=null;
    while (curr!=null) {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    return prev;
    }
    public static boolean isPalindrome(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while (fast.next!=null&&fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=reverse(slow.next);
        slow.next=temp;
        ListNode p1=head;
        ListNode p2=slow.next;
        while (p2!=null) {
            if(p1.val!=p2.val) return false;
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeLinkedList pll = new PalindromeLinkedList();
        ListNode node1 = pll.new ListNode(1, null);
        ListNode node2 = pll.new ListNode(2, node1);
        ListNode node3 = pll.new ListNode(2, node2);
        ListNode node4 = pll.new ListNode(1, node3);
        
        boolean result = isPalindrome(node4);
        System.out.println("Is the linked list a palindrome? " + result);
    }
}