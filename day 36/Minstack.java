import java.util.Stack;

public class Minstack {
    public class MinStack{
        
    }
    Stack<Integer> st=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public void push(int val){
        if(min.isEmpty()||val<=min.peek()){
            min.push(val);
        }
        else{
            min.push(min.peek());
        }
    }
    public voi
    public static void main(String[] args) {
    }
}
