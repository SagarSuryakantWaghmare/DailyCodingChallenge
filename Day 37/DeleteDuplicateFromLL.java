

public class DeleteDuplicateFromLL {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            next=next;
        }
    }
    public static ListNode DeleteDuplicateFromLL(ListNode head){
        ListNode temp=head;
        while (temp!=null && temp.next!=null) {
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;

    }
    public static void displayLL(ListNode head){
        ListNode temp=head;
        while (temp!=null) {
          System.out.print(temp.val+" ");  
          temp=temp.next;
        }
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(2);
        ListNode d=new ListNode(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        displayLL(a);
        System.out.println();
        System.out.println("After the deletion of the duplicates:");
        ListNode head=DeleteDuplicateFromLL(a);
        displayLL(head);

    }
}
