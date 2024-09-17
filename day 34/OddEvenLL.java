

public class OddEvenLL {
    static class ListNode {
        ListNode head = null;
        ListNode tail = null;
        int size = 0;
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }
    public  static ListNode oddEvenList(ListNode head){
      ListNode odd=new ListNode(0);
      ListNode even=new ListNode(0);
      ListNode  tempO=odd;
      ListNode tempE=even;
      ListNode temp=head;
      while (temp!=null) {
        tempO.next=temp;
        temp=temp.next;
        tempO=tempO.next;

        tempE.next=temp;
        if(temp==null)break;
        temp=temp.next;
        tempE=tempE.next;
      }
      odd=odd.next;
      even=even.next;
      tempO.next=even;
      return odd;
    }
    public static void display (ListNode head){
        if(head==null) return;
        System.out.print(head.val+" ");
        display(head.next);
        // System.out.println();
    }
  public static void main(String[] args) {
    ListNode a = new ListNode(5);
        ListNode b = new ListNode(6);
        ListNode c = new ListNode(7);
        ListNode d = new ListNode(8);
        ListNode e = new ListNode(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next=null;
        ListNode x=oddEvenList(a);
        display(x);
        // 5 7 10 6 8
  }  
}
