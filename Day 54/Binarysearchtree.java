import java.util.*;;

public class Binarysearchtree {
    Node root;
    private static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    // search the node
    public static boolean search(Node root,int x){
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        if(root.data>x){
            return search(root.left, x);
        }
        if(root.data<x){
            return search(root.right, x);
        }
        return false;
    }
    //Insert the bst
    public static Node insert(Node root,int data){
        if(root==null){
            root=new Node(data);
        }
        if(root.data<data){
            root.right=insert(root, data);
        }
        if(root.data>data){
            root.left=insert(root, data);

        }
        return root;
    }
}
