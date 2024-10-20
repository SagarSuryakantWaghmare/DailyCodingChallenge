import java.util.LinkedList;
import java.util.Queue;

/**
 * StackUsingQueue
 */
public class StackUsingQueue {
    public  StackUsingQueue(){

    }
    Queue<Integer> q=new LinkedList<>();

     
    public void push(int x){
          q.add(x);
    }
    public int pop(){
         if(q.isEmpty()){
            return -1;
         }
         for(int i=1;i<=q.size()-1;i++){
             q.add(q.remove());
         }
         int val=q.remove();
         return val;
    }
    public boolean isEmpty(){
         return q.isEmpty();
    }
    public int top(){
        if(q.isEmpty()){
            return -1;
        }
        for(int i=1;i<q.size()-1;i++){
            q.add(q.remove());
        }
        int val=q.peek();
        return val;
    }

    public static void main(String[] args) {
       StackUsingQueue stack=new StackUsingQueue();
       stack.push(1); 
       stack.push(2);
       stack.push(3);

       System.out.println("Top element:"+stack.top());
       System.out.println("Remove element:"+stack.pop());
       System.out.println("Elements in the stack is empty:"+stack.isEmpty());

    }
}