/**
 * DeleteNode
 */
import java.util.*;


public class DeleteNode {
    public static class Node{
        int val;
        Node next;
        Node(int x){
            val = x;
        }
    }
    public static void delNode(Node node){
        if(node==null||node.next==null){
            return;
        }
        node.val=node.next.val;
        node.next=node.next.next;
        
    }
    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        delNode(head.next);
        printList(head);
    }
}