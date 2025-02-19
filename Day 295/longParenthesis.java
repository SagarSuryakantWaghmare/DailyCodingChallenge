import java.util.Stack;

public class longParenthesis {
    public static int maxParenthesis(String s){
        int maxLength=0;
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    maxLength=Math.max(maxLength, i-st.peek());
                }
                else{
                    st.push(i);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s="(()";
        System.out.println("Max:"+maxParenthesis(s));
    }
}