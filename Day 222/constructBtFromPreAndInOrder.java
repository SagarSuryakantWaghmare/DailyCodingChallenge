import java.util.HashMap;

public class constructBtFromPreAndInOrder {
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

    public static TreeNode construct(int[] preOrder, int[] inOrder) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < inOrder.length; i++) {
            mp.put(inOrder[i], i);
        }
        TreeNode root = build(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1, mp);
        return root;

    }

    private static TreeNode build(int preOrder[], int preStart, int preEnd, int[] inOrder, int inStart, int inEnd,
            HashMap<Integer, Integer> mp) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preOrder[preStart]);
        int inRoot = mp.get(root.val);
        int numsLeft = inRoot - inStart;
        root.left = build(preOrder, preStart + 1, preStart + numsLeft, inOrder, inStart, inRoot - 1, mp);
        root.right = build(preOrder, preStart + numsLeft + 1, preEnd, inOrder, inRoot + 1, inEnd, mp);
        return root;
    }

    public static void main(String[] args) {
        int preOrder[] = { 3, 9, 20, 15, 7 };
        int inOrder[] = { 9, 3, 15, 20, 7 };
        TreeNode root = construct(preOrder, inOrder);
        printTree(root);

    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

}