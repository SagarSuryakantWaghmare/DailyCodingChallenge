public class DeleteAKeyFromDll {
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
    public static Node deleteKey(Node head,int key){
        Node current=head;
        if(current.data==key){
            head=current.next;
            current.next.prev=null;
            current.next=null;
            return head;
        }
        while(current!=null){
            if(current.data==key){
            current.prev.next=current.next;
            if(current.next!=null){
                current.next.prev=current.prev;
            }
            current.next=null;
            current.prev=null;
            return head;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);
        Node fourth = new Node(5);
        Node fifth = new Node(6);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;

        printList(head);
        Node newhead = deleteKey(head, 3);
        printList(newhead);
    }
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}