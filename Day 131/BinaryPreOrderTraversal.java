
/**
 * BinaryPreOrderTraversal
 */
import java.util.*;

public class BinaryPreOrderTraversal {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        TreeNode(int x, TreeNode left, TreeNode right) {
            this.val = x;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> preOrder = new LinkedList<>();
        pre(root, preOrder);
        return preOrder;
    }

    public static void pre(TreeNode root, List<Integer> preOrder) {
        if (root == null) {
            return;
        }
        preOrder.add(root.val);
        pre(root.left, preOrder);
        pre(root.right, preOrder);
    }

    public static void main(String[] args) {
        BinaryPreOrderTraversal binaryTree = new BinaryPreOrderTraversal();
        TreeNode root = binaryTree.new TreeNode(1);
        root.left = binaryTree.new TreeNode(2);
        root.right = binaryTree.new TreeNode(3);
        List<Integer> result = preOrderTraversal(root);
        System.out.println(result); // [1, 2, 3]
    }
}