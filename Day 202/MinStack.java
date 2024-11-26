import java.util.Stack;

public class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        st.push(x);
        if (min.isEmpty() || x <= min.peek()) {
            min.push(x);
        } else {
            min.push(min.peek());
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
            min.pop();
        }
    }

    public int top() {
        if (!st.isEmpty()) {
            return st.peek();
        }
        return -1;
    }

    public int getMin() {
        if (!min.isEmpty()) {
            return min.peek();
        }
        return -1;
    }
}