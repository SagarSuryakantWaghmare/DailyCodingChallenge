import java.util.*;;
public class CalculateParenthesis {
    public static int TotalParenthesis=0;
    public static void main(String[] args) {
        int n=3;
        generateParenthesis(n);
        System.out.println(TotalParenthesis);
    }
    private static void generateParenthesis(int n) {
       List<String> ans=new ArrayList<>();
       parenthesis("",0,0,n,ans);
    }
    private static void parenthesis(String string, int open, int closed, int n, List<String> ans) {
        if(string.length()==2*n){
            ans.add(string);
            TotalParenthesis++;
            return;
        }
      if(open<n){
        parenthesis(string+'(', open+1, closed, n, ans);
      }  
      if(closed<open){
        parenthesis(string+')', open, closed+1, n, ans);
      }
    }
}
