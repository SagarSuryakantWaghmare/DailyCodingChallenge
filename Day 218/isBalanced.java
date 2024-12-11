public class isBalanced {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val,TreeNode left,TreeNode right){
         this.val=val;
         this.left=null;
         this.right=null;
        }
    }
    public static boolean checkBalanced(TreeNode root){
        return checkHeight(root)!=-1;
    }
    public static int checkHeight(TreeNode root){
       if(root==null )return 0;
       int lh=checkHeight(root.left);
       int rh=checkHeight(root.right);
       if(lh==-1) return -1;
       if(rh==-1) return -1;
       if(Math.abs(lh-rh)>1) return -1;
       return Math.max(lh, rh)+1;
    }

    public static void main(String[] args) {
        TreeNode root= new TreeNode(5);
        root.left=new TreeNode(4);
        root.right=new TreeNode(6);
        root.left.left=new TreeNode(2);
        root.right.right=new TreeNode(10);
        System.out.println(checkBalanced(root));
    }
}