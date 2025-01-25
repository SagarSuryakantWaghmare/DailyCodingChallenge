import java.util.List;

public class DeleteMiddleNode{
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data,ListNode next){
            this.data=data;
            this.next=null;
        }
        ListNode(int data){
            this.data=data;
        }
    }
    public static void printList(ListNode head){
        ListNode temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static ListNode deleteMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        fast=head.next.next;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        if(slow.next!=null){
            slow.next=slow.next.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        a.next=new ListNode(2);
        a.next.next=new ListNode(3);
        a.next.next.next=new ListNode(4);
        a.next.next.next.next=new ListNode(5);
        printList(a);
       ListNode ans= deleteMiddle(a);
        System.out.println("After deleting the middle element:");
        printList(ans);

    }
}