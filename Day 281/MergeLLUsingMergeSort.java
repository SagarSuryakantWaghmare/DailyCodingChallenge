public class MergeLLUsingMergeSort {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static ListNode mergeSort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(mid);
        return merge(left,right);
    }
    public static ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }
    public static ListNode merge(ListNode left, ListNode right){
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while(left!=null && right!=null){
            if(left.val<right.val){
                prev.next = left;
                left = left.next;
            }else{
                prev.next = right;
                right = right.next;
            }
            prev = prev.next;
        }
        if(left!=null){
            prev.next = left;
        }
        if(right!=null){
            prev.next = right;
        }
        return dummy.next;
    }
    public static void printList(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(9);
        head.next.next = new ListNode(8);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next.next.next = new ListNode(1);

        head = mergeSort(head);
        printList(head);
    }
}