import java.util.Stack;

public class nextGreaterNumber {
    public static int[] nextGreaterNumber(int arr[],int n){
        int []res=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while (!st.isEmpty()&&st.peek()<=arr[i]){
                st.pop();
            }
             if(st.isEmpty()){
                res[i]=-1;
             }
             else{
                res[i]=st.peek();
             }
             st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {5, 8, 1, 7, 5};
        int n = arr.length;
        int[] res = nextGreaterNumber(arr, n);
        System.out.println("Next Greater Number for each element in the array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }

}