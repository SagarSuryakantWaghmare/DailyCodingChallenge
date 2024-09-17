
// Leetcode:20-Valid parenthesis

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else if(st.size()>0){
                char dh=st.peek();
                if(ch==')'){
                    if(dh=='(')st.pop();
                    else return false;
                }
                if(ch==']'){
                    if(dh=='[')st.pop();
                    else return false;
                }
                if(ch=='}'){
                    if(dh=='{')st.pop();
                    else return false;
                }
            }
            else return false;
        }
        if(st.size()>0) return false;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       System.out.println("Parenthesis is valid?"+isValid(str));

   } 
}
