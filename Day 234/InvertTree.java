public class InvertTree{
    public static class TreeNode {
    
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static TreeNode invertTree(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    public static void main(String[]args){
       TreeNode root=new TreeNode(4);
       root.left=new TreeNode(2);
       root.right=new TreeNode(8);
       print(root);
       TreeNode newRoot=invertTree(root);
       System.out.println();
       System.out.println("After the inverting the tree:");
       print(newRoot);
    }
    public static void print(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        print(root.left);
        print(root.right);
    }
}