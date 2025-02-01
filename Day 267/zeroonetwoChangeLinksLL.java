public class zeroonetwoChangeLinksLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node segregate(Node head) {
        Node temp = head;
        Node zero = new Node(-1);
        Node one = new Node(-1);
        Node two = new Node(-1);
        Node z = zero;
        Node o = one;
        Node t = two;
        
        while (temp != null) {
            if (temp.data == 0) {
                z.next = temp;
                z = z.next;
            } else if (temp.data == 1) {
                o.next = temp;
                o = o.next;
            } else {
                t.next = temp;
                t = t.next;
            }
            temp = temp.next;
        }
        two = two.next;
        one = one.next;
        z.next = one;
        o.next = two;
        t.next = null;
        
        return zero.next;
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);
        
        Node result = segregate(head);
        
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}