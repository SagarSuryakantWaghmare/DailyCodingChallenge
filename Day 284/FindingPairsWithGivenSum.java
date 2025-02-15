import java.util.*;
public class FindingPairsWithGivenSum {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void findPairs(Node head, int sum) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node right = temp;
        Node left = head;
        List<List<Integer>> res = new ArrayList<>();
        while (left != null && right != null && right != left && right.next != left) {
            if (left.data + right.data == sum) {
                List<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                res.add(pair);
                left = left.next;
                right = right.prev;
            } else if (left.data + right.data < sum) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }
        if (res.size() == 0) {
            System.out.println("No pairs are found in the given linked list");
        } else {
            for (List<Integer> pair : res) {
                System.out.println(pair.get(0) + " " + pair.get(1));
            }
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = null;
        head.prev = null;
        int sum = 7;
        findPairs(head, sum);
    }
}