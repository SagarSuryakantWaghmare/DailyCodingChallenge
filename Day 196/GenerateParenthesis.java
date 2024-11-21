import java.util.*;
public class GenerateParenthesis {
    public static List<String> generateParenthesis(int n){
        List<String> ans=new ArrayList<>();
         parenthesis("",0,0,n,ans);
         return ans;
    }
    public static void parenthesis(String curr,int open,int closed,int n,List<String> ans){
     if(curr.length()==2*n){
        ans.add(curr);
        return;
     }
     if(open<n){
        parenthesis(curr+"(", open+1, closed, n, ans);
     }
     if(closed<open){
        parenthesis(curr+")", open, closed+1, n, ans);
     }
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(generateParenthesis(n));
    }
}