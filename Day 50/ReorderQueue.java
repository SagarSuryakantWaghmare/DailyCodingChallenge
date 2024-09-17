import java.util.*;

public class ReorderQueue {
    public static void main(String[] args) {
        // reorder queue
        // 1 2 3 4 5 6 7 8
        // 1 5 2 6 3 7 4 8
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        int n = q.size();
        for (int i = 1; i <= n / 2; i++) {
            st.push(q.poll());
        }
        while (st.size() > 0) {
            q.add(st.pop());
        }
        for (int i = 1; i <= n / 2; i++) {
            st.push(q.poll());
        }
        for (int i = 1; i <= n / 2; i++) {
            q.add(st.pop());
            q.add(q.remove());
        }
        System.out.println(q);
        
    }
}
