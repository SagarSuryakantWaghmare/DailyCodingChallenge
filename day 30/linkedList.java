
public class linkedList {
   public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
   }
   public static class linkedlist{
    int size=0;
    Node head=null;
    Node tail=null;
    // inserting at end
    void insertAtEnd(int val){
        Node temp =new Node(val);
        if(head==null){
            head=temp;
        }
        else{
            tail.next=temp;
        }
        tail=temp;
        size++;
    }
    // Insert at the beginning method
    void insertAtHead(int val){
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    // Insert method at any given index
    void insertAtIndex(int val,int index){
        Node t=new Node(val);
        Node temp=head;
        if(index==size){
           insertAtEnd(val);
           return;
        }
        else if(index==0){
            insertAtHead(val);
            return;
        }
        else if(index<0){
            System.out.println("Wrong index");
            return;
        }
        for(int i=1;i<=index-1;i++){
            temp=temp.next;
        }
        t.next=temp.next;
        temp.next=t;
        size++;

    }
    void display(){
        Node temp=head;
        
    }
   }
   public static void main(String[] args) {
    linkedlist ll=new linkedlist();
    ll.insertAtEnd(4);
   } 
}
