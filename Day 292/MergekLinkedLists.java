import java.util.PriorityQueue;

public class MergekLinkedLists {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int data){
            this.val=data;
            this.next=null;
        }
    }
    public static ListNode mergeKLists(ListNode []lists){
        PriorityQueue<ListNode> min=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode head:lists){
            if(head!=null) min.add(head);
        }
        ListNode d=new ListNode(-1);
        ListNode t=d;
        while (!min.isEmpty()) {
            ListNode n=min.poll();
            t.next=n;
            t=t.next;
            if(n.next!=null) min.add(n.next);
        }
        return d.next;

    }

    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];
    
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(7);
    
        lists[1] = new ListNode(2);
        lists[1].next = new ListNode(5);
        lists[1].next.next = new ListNode(8);
    
        lists[2] = new ListNode(3);
        lists[2].next = new ListNode(6);
        lists[2].next.next = new ListNode(9);
        lists[2].next.next .next= new ListNode(10);
    
        ListNode mergedHead = mergeKLists(lists);
        
        while (mergedHead != null) {
            System.out.print(mergedHead.val + " -> ");
            mergedHead = mergedHead.next;
        }
        System.out.println("null");
    }
    
}