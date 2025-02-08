

public class insertIntoDLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node makeDLL(int[]arr){
        if(arr.length==0){
            return null;
        }
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node n=new Node(arr[i]);
            temp.next=n;
            n.prev=temp;
            temp=n;
        }
        return head;
    }
    public static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = makeDLL(arr);
        printDLL(head);
    }
}