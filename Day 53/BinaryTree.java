import java.util.*;;

public class BinaryTree {
    static Scanner sc = null;

    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }

    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();

        InOrderTraversal(root);
        System.out.println();
        preOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
        System.out.println();
        System.out.println("Height of the given tree is "+height(root));
        System.out.println();
        System.out.println("Size of the binary tree is "+size(root));
        System.out.println();
        System.out.println("Maximum in binary tree is "+Maximum(root));
        System.out.println();
        System.out.println("Minimum in binary tree is "+Minimum(root));
        // 7 4 2 8 1 3
        // 2 4 7 1 8 3
        // 7 4 8 3 1 2
    }
    private static Node createTree() {
       Node root=null;
       System.out.println("Enter data:");
       int data=sc.nextInt();
       if(data==-1){
        return null;
       }
       root=new Node(data);
       System.out.println("Enter left for "+data);
       root.left=createTree();
       System.out.println("Enter right for "+data);
       root.right=createTree();
       return root;

    }
    public static void InOrderTraversal(Node root){
        if(root==null) {
            return;
        }
        InOrderTraversal(root.left);
        System.out.print(root.data+" ");
        InOrderTraversal(root.right);
    }
    public static void preOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void postOrderTraversal(Node root){
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }
    //height
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    //size
    public static int size(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(size(root.left),size(root.right))+1;
    }
    //maximum in a binary tree
    public static int Maximum(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(Maximum(root.left), Maximum(root.right)));
    }
    // Minimum in a binary tree
    public static int Minimum(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(Minimum(root.left), Minimum(root.right)));
    }
}
