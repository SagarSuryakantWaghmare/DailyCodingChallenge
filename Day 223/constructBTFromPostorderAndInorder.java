import java.util.HashMap;

public class constructBTFromPostorderAndInorder {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static TreeNode bt(int[] inOrder, int[] postOrder) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < inOrder.length; i++) {
            mp.put(inOrder[i], i);
        }
        TreeNode root = construct(inOrder, 0, inOrder.length - 1, postOrder, 0, postOrder.length - 1, mp);
        return root;
    }

    public static TreeNode construct(int[] inOrder, int inStart, int inEnd, int[] postOrder, int poStart, int poEnd,
            HashMap<Integer, Integer> mp) {
        if (inStart > inEnd || poStart > poEnd) {
            return null;
        }
        TreeNode root = new TreeNode(postOrder[poEnd]);
        int inRoot = mp.get(root.val);
        int numsLeft = inRoot - inStart;
        root.left = construct(inOrder, inStart, inRoot - 1, postOrder, poStart, poStart + numsLeft - 1, mp);
        root.right = construct(inOrder, inRoot + 1, inEnd, postOrder, poStart + numsLeft, poEnd - 1, mp);
        return root;

    }

    public static void main(String[] args) {
        int[] inOrder = { 9, 3, 15, 20, 7 };
        int[] postOrder = { 9, 15, 7, 20, 3 };
        TreeNode root = bt(inOrder, postOrder);
        print(root);
    }

    public static void print(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }
}
