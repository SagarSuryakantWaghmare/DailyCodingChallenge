public class SwapNodes {
    public static class Node {
        int val;
        Node next;

        Node() {
        }

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public static Node swapPairs(Node head) {
        Node temp=new Node(0);
        temp.next=head;

        // Two pointers
        Node prev=temp;
        Node curr=head;
        while (curr!=null&& curr.next!=null) {
            Node firstNode=curr;
            Node secondNode=curr.next;

            prev.next=secondNode;
            firstNode.next=secondNode.next;
            secondNode.next=firstNode;

            prev=firstNode;
            curr=firstNode.next;
        }
        return temp.next;
    }

    public static void main(String[] args) {

       Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println(swapPairs(head));

    }
}
