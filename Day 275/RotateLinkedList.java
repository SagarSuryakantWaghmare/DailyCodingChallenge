public class RotateLinkedList {
    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        head = rotateRight(head, k);

        printList(head);
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static ListNode rotateRight(ListNode head,int k){
        if(head==null||head.next==null||k==0){
            return head;
        }
        int length=1;
        ListNode temp=head;
        while (temp.next!=null) {
            length++;
            temp=temp.next;
        }
        k=k%length;
        int skip=length-k;
        temp.next=head;
        while (skip-->0) {
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
        
    }

}