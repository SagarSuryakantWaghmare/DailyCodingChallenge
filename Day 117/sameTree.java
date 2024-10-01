/**
 * sameTree
 */
public class sameTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public static boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return (p.val==q.val)&&isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        sameTree solution = new sameTree();
        
        // Creating the first tree
        TreeNode tree1 = solution.new TreeNode(1, null, null);
        tree1.left = solution.new TreeNode(2, null, null);
        tree1.right = solution.new TreeNode(3, null, null);
        
        // Creating the second tree
        TreeNode tree2 = solution.new TreeNode(1, null, null);
        tree2.left = solution.new TreeNode(2, null, null);
        tree2.right = solution.new TreeNode(3, null, null);
    
        // Check if the two trees are the same
        System.out.println(isSameTree(tree1,tree2));

    }
    
}