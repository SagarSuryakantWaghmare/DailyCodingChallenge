import java.util.ArrayList;

public class StringSubstring {
    static ArrayList<String> SSQ(String s){
        ArrayList<String>ans=new ArrayList<>();

        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char curr=s.charAt(0);
        ArrayList<String>smallAns=SSQ(s.substring(1));
        for(String ss:smallAns){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans=SSQ("abc");
        for(String ss:ans){
            System.out.println(ss);
        }
    }
}
