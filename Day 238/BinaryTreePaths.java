import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static List<String> binaryTreePaths(TreeNode root){
       List<String> result=new ArrayList<>();
       if(root==null){
        return result;
       }
       String current_path=Integer.toString(root.val);
       if(root.left==null&& root.right==null){
        result.add(current_path);
       }
       if(root.left!=null) dfs(root.left,current_path,result);
       if(root.right!=null) dfs(root.right,current_path,result);
       return result;
    }

    public static void dfs(TreeNode node,String current_path,List<String> result){
        current_path+="->"+node.val;
        if(node.left==null&& node.right==null){
            result.add(current_path);
            return;
        }
        if(node.left!=null) dfs(node.left,current_path,result);
       if(node.right!=null) dfs(node.right,current_path,result);
      

    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.left.right=new TreeNode(5);
        root.right=new TreeNode(8);
        System.out.println(binaryTreePaths(root));
    }
}