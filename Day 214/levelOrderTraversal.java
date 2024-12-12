import java.util.*;

public class levelOrderTraversal {

    public static class ListNode {
        int val;
        ListNode left;
        ListNode right;
        ListNode() {}

        ListNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        ListNode(int val, ListNode left, ListNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<List<Integer>> levelOrder(ListNode root) {
        Queue<ListNode> queue = new LinkedList<>(); 
        List<List<Integer>> wrap = new LinkedList<>();

        if (root == null) return wrap;

        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> sub = new LinkedList<>();
            for (int i = 0; i < levelNum; i++) {
                ListNode current = queue.poll();
                sub.add(current.val);
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }

            wrap.add(sub);
        }
        return wrap;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.left = new ListNode(2);
        root.right = new ListNode(3);
        root.left.left = new ListNode(4);
        root.left.right = new ListNode(5);
        root.right.left = new ListNode(6);
        root.right.right = new ListNode(7);

        List<List<Integer>> ans = levelOrder(root);
        for (List<Integer> level : ans) {
            System.out.println(level);
        }
    }
}
