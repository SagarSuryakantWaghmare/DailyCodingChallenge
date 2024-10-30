/**
 * rotatedRightList
 */
public class rotatedRightList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode RotatedRightList(ListNode head,int k){
        // if the list is empty
        if(head==null||head.next==null||k==0){
            return head;
        }
        // Find the length of the List
        int length=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        // Make the list circular
        temp.next=head;
        // Calculate the rotation length
        k=k%length;
        int skip=length-k;
        // Find the new head
        for(int i=0;i<skip-1;i++){
            temp=temp.next;
        }
        // Make the list linear
        head=temp.next;
        temp.next=null;
        return head;
    }

    public static void main(String[] args) {
        rotatedRightList list = new rotatedRightList();
        ListNode head = list.new ListNode(1);
        head.next = list.new ListNode(2);
        head.next.next = list.new ListNode(3);
        head.next.next.next = list.new ListNode(4);
        head.next.next.next.next = list.new ListNode(5);

        int k = 2;
        ListNode result = RotatedRightList(head, k);

        // Print the rotated list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}