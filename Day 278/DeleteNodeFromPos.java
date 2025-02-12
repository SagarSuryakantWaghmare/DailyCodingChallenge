import java.util.List;

public class DeleteNodeFromPos {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void printList(Node head) {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static Node deleteNodeFromPos(Node head, int pos) {
        if(head == null) {
            return null;
        }
        if(pos == 1) {
            return head.next;
        }
        Node curr = head;
        for(int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }
        if(curr == null || curr.next == null) {
            return head;
        }
        curr.next = curr.next.next;
        return head;
    }


    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Before Deletion: ");
        printList(head);

        int pos = 3;
        head = deleteNodeFromPos(head, pos);

        System.out.println("After Deletion: ");
        printList(head);
    }
}