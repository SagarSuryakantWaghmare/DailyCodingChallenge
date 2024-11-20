import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s){
        Stack<Character> st=new Stack<>();
        if(s.length()==0){
            return true;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{'||ch=='['||ch=='('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char dh=st.peek();
                if(ch==']'){
                    if(dh=='['){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
                if(ch==')'){
                    if(dh=='('){
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
                    else{
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }
}