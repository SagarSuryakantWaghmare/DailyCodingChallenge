
public class oddEvenLL {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode tempO = odd;
        ListNode tempE = even;
        ListNode temp = head;
        
        boolean isOdd = true;
        while (temp != null) {
            if (isOdd) {
                tempO.next = temp;
                tempO = tempO.next;
            } else {
                tempE.next = temp;
                tempE = tempE.next;
            }
            temp = temp.next;
            isOdd = !isOdd;
        }
        
        
        tempE.next = null;
   
        tempO.next = even.next;
        
        return odd.next;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

      
        ListNode reorderedHead = oddEvenList(head);

        System.out.println("Reordered list:");
        printList(reorderedHead);
    }
}
