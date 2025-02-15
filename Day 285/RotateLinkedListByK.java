public class RotateLinkedListByK {
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
    } 
    public static ListNode rotate(ListNode head,int k){
        ListNode temp=head;
        int length=1;
        while (temp.next!=null) {
            temp=temp.next;
            length++;
        }
        temp.next=head;
        temp=head;
        if (k==0) {
            return head;
        }
        k=k%length;
        for(int i=0;i<k-1;i++){
         temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;

    }
    

    public static void main(String[] args) {
      ListNode head=new ListNode(1);
      ListNode first=new ListNode(2);
      ListNode second=new ListNode(3);
      ListNode third=new ListNode(4);
      ListNode forth=new ListNode(5);
      head.next=first;
      first.next=second;
      second.next=third;
      third.next=forth;
      forth.next=null;
      printList(head);
      System.out.println("Rotate linked list:");
      ListNode newHead=rotate(head,3);
      printList(newHead);

    }
}