import java.util.*;
public class removeKthDigits {
    public static String removeKthDigits(String s,int k){
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for (int i = 0; i < n; i++) {
            // 1 4 3 2 2 1 9
            // 1 2 1 9
            while (!st.isEmpty()&&k>0&&(st.peek()-'0')>(s.charAt(i)-'0')) {
                st.pop();
                k--;
            }
            st.push(s.charAt(i));
        }
        while (k>0) {
            st.pop();
            k--;
        }
        if(st.isEmpty()){
            return "0";
        }

        StringBuilder res=new StringBuilder();
        // 1 4 3 2 2 1 9
        // 1 2 1 9
        while (!st.isEmpty()) {
            // 9 1 2 1
            res.append(st.pop());
        }
        res.reverse();
        // Remove loading zeros
        while (res.length()>1&&res.charAt(0)=='0') {
            res.deleteCharAt(0);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str = "1432219";
        int k = 3;
        System.out.println(removeKthDigits(str, k));
    }
}