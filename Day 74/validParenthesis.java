import java.util.Stack;

/**
 * validParenthesis
 */
public class validParenthesis {
    public static boolean isValid(String s){
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'|| ch=='['){
                st.push(ch);
            }
            else if(st.size()>0){
                char dh=st.peek();
                if(ch==')'){
                    if(dh=='('){
                        st.pop();
                    }
                    else return false;
                }
                if(ch==']'){
                    if(dh=='['){
                        st.pop();
                    }
                    else{
                         return false;
                    }
                }
                if(ch=='}'){
                    if(dh=='{'){
                        st.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        if(st.size()>0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="{(){[]}}";
        System.out.println(isValid(s));
    }
}