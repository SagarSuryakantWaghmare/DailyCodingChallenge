public class MaxDepth {
    public static class Node{
        int val;
        Node left;
       Node right;
        Node(int val){
          this.val=val;
        }
        Node(int val,Node left,Node right){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static int maxDepth(Node root){
        if(root==null) return 0;
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
        return 1+Math.max(lh, rh);
    }

     public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(maxDepth(root));
    }
}