public class Bst {
    public  static class ListNode {
        int val;
        ListNode left=null;
        ListNode right=null;
    
        ListNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean isValidBst(ListNode root){
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean isValid(ListNode root,long minValue,long maxValue){
        if(root==null) return true;
        if(root.val<=minValue||root.val>=maxValue) return false;
        return isValid(root.left, minValue, root.val)&&
        isValid(root.right, root.val, maxValue);
    }

    public static void main(String[] args) {
        ListNode root=new ListNode(5);
        root.left= new ListNode(3);
        root.left.left=new ListNode(2);
        root.left.right=new ListNode(4);
        root.right=new ListNode(7);
        root.right.left=new ListNode(6);
        root.right.right=new ListNode(8);
        System.out.println(isValidBst(root));
    }
}