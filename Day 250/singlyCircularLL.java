public class singlyCircularLL{
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void insertAtFirst(ListNode last,int data){
        ListNode temp=last;
        ListNode val=new ListNode(data);
        if(last==null){
             val.next=val;
             last=val;
        }
        val.next=last.next;
        last.next=val;
        printList(last);
    }
    public static void printList(ListNode last){
        ListNode temp=last;
        do{
            temp=temp.next;
            System.out.print(temp.data+"");
        }while(temp!=last);
    }
    public static void insertAtEnd(ListNode last,int data){
        ListNode temp=last;
        ListNode val=new ListNode(data);
        if(last==null){
            val.next=val;
            last=val;
        }
        val.next=last.next;
        last.next=val;
        last=val;
        printList(last);
    }
    public static void main(String[]args){
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);

        head.next = second;
        second.next = third;
        third.next = head;

       printList(third);
       System.out.println();
       insertAtFirst(third,4);
       System.out.println();
       insertAtEnd(third,5);
    }
}