import java.util.ArrayList;
import java.util.List;

/**
 * InorderTraversal
 */
public class InorderTraversal {
    public class Node{
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public List<Integer> inorder(Node root){
        List<Integer> ans=new ArrayList<>();
        inorderAns(root,ans);
        return ans;
    }
    public void inorderAns(Node root,List<Integer> ans){
        if(root==null) return ;
        inorderAns(root.left, ans);
        ans.add(root.data); 
        inorderAns(root.right, ans);
    }

    public static void main(String[] args) {
        InorderTraversal traversal = new InorderTraversal();
        Node root = traversal.new Node(1);
        root.left = traversal.new Node(2);
        root.right = traversal.new Node(3);
        root.left.left = traversal.new Node(4);
        root.left.right = traversal.new Node(5);

        List<Integer> result = traversal.inorder(root);
        System.out.println(result);
    }
}