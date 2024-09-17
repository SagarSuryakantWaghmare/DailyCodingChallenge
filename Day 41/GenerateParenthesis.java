import java.util.ArrayList;
import java.util.List;

/**
 * GenerateParenthesis
 */
public class GenerateParenthesis {
    public  static void solve(String curr,int open,int close,int total,List<String>ans){
    if(curr.length()==2*total){
        ans.add(curr);
        return;
    }
    if(open<total){
        solve(curr+'(', open+1, close, total, ans); 
    }
    if(close<open){
        solve(curr+')', open, close+1, total, ans);
    }
    }
    public static List<String> generateParenthesis(int n){
    List<String> ans=new ArrayList<>();
    solve("", 0, 0, n, ans);
    return ans;
    }

    public static void main(String[] args) {
       int n=4;
       System.out.println(generateParenthesis(n));
    }
}