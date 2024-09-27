import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}

public class RemoveDuplicatesFromLL {
    public static ListNode deleteDuplicates(ListNode head){
        ListNode temp=head;
        while(temp!=null&& temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, null)))));
        head = deleteDuplicates(head);
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}