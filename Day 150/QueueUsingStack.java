import java.util.ArrayList;
import java.util.Stack;
/**
 * QueueUsingStack
 */
public class QueueUsingStack {
    public  QueueUsingStack(){

    }
    Stack<Integer> input=new Stack<>();
    Stack<Integer> output=new Stack<>();
    public void push(int x){
        input.add(x);
    }
    public int pop(){
        if(output.isEmpty()){
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        if(!output.isEmpty()){
            return output.pop();
        }
        else{
            return -1;
        }
    }
    public int peek(){

        if(output.isEmpty()){
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        if(!output.isEmpty()){
            return output.peek();
        }
        else{
            return -1;
        }
    }
    public boolean Empty(){
        return input.isEmpty()&&output.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.pop()); 
        System.out.println(queue.peek());
        System.out.println(queue.pop()); 
        System.out.println(queue.Empty()); 
        System.out.println(queue.pop()); 
        System.out.println(queue.Empty());
    }
}