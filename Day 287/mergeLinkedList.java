public class mergeLinkedList {
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


    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        a.next=new ListNode(4);
        a.next.next=new ListNode(6);
        a.next.next.next=new ListNode(7);
        ListNode b=new ListNode(5);
        b.next=new ListNode(8);
        ListNode merged=merge(a,b);
        printList(merged);
    }
}