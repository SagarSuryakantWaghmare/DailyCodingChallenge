
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueue{
    // Implement stack using queues
    // Leetcode-225-easy
    /*
     * implement a last-in-first-out(Lifo) stack using only
     * two queues.
     * 
     * // * push->O(1)
     * Peek->O(n)
     * pop->O(n)
     */
    Queue<Integer> q = new LinkedList<>();

    // Stack<Integer> st=new Stack<>();
    public StackUsingQueue() {

    }

    public int pop() {
        return q.poll();
    }

    public void push(int x) {
        if(q.size()==0){
            q.add(x);
        }
        else{
            q.add(x);
            for(int i=1;i<=q.size()-1;i++){
                q.add(q.remove());
            }
        }
    }
    public int top(){
        return q.peek();
    }

    public boolean empty() {
       if(q.size()==0){
        return true;
       }
       else{
        return false;
       }
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // Print the top element
        System.out.println("Top element: " + stack.top()); // Expected output: 4

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop()); // Expected output: 4
        System.out.println("Top element after pop: " + stack.top()); // Expected output: 3

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.empty()); // Expected output: false

        // Pop remaining elements
        System.out.println("Popped element: " + stack.pop()); // Expected output: 3
        System.out.println("Popped element: " + stack.pop()); // Expected output: 2
        System.out.println("Popped element: " + stack.pop()); // Expected output: 1

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.empty()); // Expected output: true
    }

}
