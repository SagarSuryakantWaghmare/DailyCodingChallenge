public class CountNodes {
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
    public static int countNodes(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftHeight=getHeight(node.left);
        int rightHeight=getHeight(node.right);
        if(leftHeight==rightHeight){
            return (1<<leftHeight)+countNodes(node.right);
        }
        else{
            return (1<<rightHeight)+countNodes(node.left);
        }
    }
    private static int getHeight(TreeNode node){
        int height=0;
        while (node!=null) {
            node=node.left;
            height++;
        }
        return height;
    }

    public static void main(String[] args) {
        TreeNode node=new TreeNode(1);
        node.left=new TreeNode(2);
        node.left.left=new TreeNode(4);
        node.left.right=new TreeNode(5);
        node.right=new TreeNode(3);
        node.right.left=new TreeNode(6);
        System.out.println(countNodes(node));
    }
}