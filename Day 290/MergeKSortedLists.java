import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeKSortedLists {
    
    public static ListNode mergeKLists(ListNode[] lists) {
     if(lists==null||lists.length==0){
        return null;
     }
     PriorityQueue<ListNode> minHeap=new PriorityQueue<>((a,b)->a.val-b.val);
     for (ListNode list : lists) {
        if(list!=null){
            minHeap.offer(list);
        }
     }
     ListNode dummy=new ListNode(-1);
     ListNode current=dummy;
     while (!minHeap.isEmpty()) {
        ListNode smallest=minHeap.poll();
        current.next=smallest;
        current=current.next;
        if(smallest.next!=null){
            minHeap.offer(smallest.next);
        }
     }
     return dummy.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(4);
        a.next.next = new ListNode(6);
        a.next.next.next = new ListNode(7);

        ListNode b = new ListNode(5);
        b.next = new ListNode(8);

        ListNode c = new ListNode(2);
        c.next = new ListNode(3);
        c.next.next = new ListNode(9);

        // Creating an array of lists
        ListNode[] lists = {a, b, c};

        ListNode mergedHead = mergeKLists(lists);

        while (mergedHead != null) {
            System.out.print(mergedHead.val + " -> ");
            mergedHead = mergedHead.next;
        }
        System.out.println("null");
    }
}
