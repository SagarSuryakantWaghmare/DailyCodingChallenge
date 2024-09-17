
import java.util.*;
public class stack {
   public static void main(String[] args) {
    Stack<Integer> st=new Stack<>();
    st.push(4);
    st.push(2);
    st.push(8);
    st.push(7);
    st.push(11);
    // System.out.println(st);
    // Stack<Integer>rt=new Stack<>();
    // while (st.size()>0) {
    //     rt.push(st.pop());
    // }
    // System.out.println("Printing the stack:");
    // while (rt.size()>0) {
    //     int x=rt.pop();
    //     System.out.print(x+" ");
    //     st.push(x);
    // }
    // Printing using the array
    int n=st.size();
    int[]arr=new int[n];
    for(int i=0;i<n;i++){
     arr[i]=st.pop();  
    }
    for(int i=n-1;i>=0;i--){
      System.out.print(arr[i]+" ");
      st.push(arr[i]);
    }

    

   } 
}
