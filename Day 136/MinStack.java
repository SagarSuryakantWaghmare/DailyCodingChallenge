import java.util.Stack;

public class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
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

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        
        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);
        
        System.out.println("Minimum value: " + minStack.getMin()); // Output: 2
        System.out.println("Top value: " + minStack.top()); // Output: 2
        
        minStack.pop();
        
        System.out.println("Minimum value: " + minStack.getMin()); // Output: 3
        System.out.println("Top value: " + minStack.top()); // Output: 7
        
        minStack.pop();
        
        System.out.println("Minimum value: " + minStack.getMin()); // Output: 3
        System.out.println("Top value: " + minStack.top()); // Output: 3
    }
}
