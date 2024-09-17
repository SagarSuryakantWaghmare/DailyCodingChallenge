import java.util.*;
public class ReverseFirstKElements {
    // reverse First k elements
    public static void main(String[] args) {
        int k=3;
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // 1 2 3 4 5
        // 4 5 3 2 1
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<=k;i++){
           st.push(q.poll());
        }
        while (st.size()>0) {
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
