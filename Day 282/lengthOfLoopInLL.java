import java.util.HashMap;

public class lengthOfLoopInLL {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static int lengthOfLoop(ListNode head){
        HashMap<ListNode,Integer> mp=new HashMap<>();
        int index=0;
        ListNode temp=head;
        while (temp!=null) {
            if(mp.containsKey(temp)){
                return index-mp.get(temp);
            }
            mp.put(temp, index);
            temp=temp.next;
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
        ListNode forth=new ListNode(5);
        head.next=second;
        second.next=third;
        third.next=forth;
        forth.next=second;
        System.out.println(lengthOfLoop(head));
    }
}