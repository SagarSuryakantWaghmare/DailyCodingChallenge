import java.util.concurrent.LinkedTransferQueue;

public class mergeSortLL{
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
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
    public static ListNode merge(ListNode a,ListNode b){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while (a!=null&&b!=null) {
            if(a.data<=b.data){
                temp.next=a;
                a=a.next;
            }
            else{
                temp.next=b;
                b=b.next;
            }
            temp=temp.next;
        }
        if(a==null){
            temp.next=b;
        }
        if(b==null){
            temp.next=a;
        }
        return dummy.next;
    }
    public static ListNode findMiddle(ListNode temp){
        ListNode fast=temp;
        ListNode slow=temp;
        while (fast.next!=null&&fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode mergeSort(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode temp=head;
        ListNode middle=findMiddle(temp);
        ListNode left=head;
        ListNode right=middle.next;
        middle.next=null;
        left=mergeSort(left);
        right=mergeSort(right);
        return merge(left, right);
    }


    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        a.next=new ListNode(4);
        a.next.next=new ListNode(8);
        a.next.next.next=new ListNode(5);
        a.next.next.next.next=new ListNode(7);
        a.next.next.next.next.next=new ListNode(6);
        printList(a);
        ListNode merged=mergeSort(a);
        printList(merged);
    }
}