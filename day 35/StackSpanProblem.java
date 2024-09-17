import java.util.Stack;

public class StackSpanProblem {
    public static int[] calculateSpan(int[]price,int n){
        int[]span =new int[n];
        Stack<Integer> st=new Stack<>();

        // span for the first day is always 1
        span[0]=1;
        st.push(0);
        for(int i=1;i<n;i++){
            //pop elements from stack while stack is not empty and
            // the price at the index stored at the top of the stack is less or equal to current price
            while (!st.isEmpty()&& price[st.peek()]<=price[i]) {
                st.pop();
            }
            // If stack becomes empty , then prices[i] is greater than all elements to the left of it
            // else price[i] is greater than elements after stack top
            span[i]=(st.isEmpty())?(i+1):(i-st.peek());

            // push the element to stack
            st.push(i);
        }
        return span;
        
    }
  public static void main(String[] args) {
    int n=7;
    int price[]={100,80,60,70,60,75,85};
    int span[]=calculateSpan(price,n);
    for(int i:span){
        System.out.print(i+" ");
    }
  }  
}
