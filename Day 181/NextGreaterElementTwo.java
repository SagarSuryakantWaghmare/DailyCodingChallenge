import java.util.Stack;

public class NextGreaterElementTwo {
    public static int[] nextGreaterElements(int []nums){
        Stack<Integer> st=new Stack<>();
        int []res=new int[nums.length];
        int n=nums.length;
        // Result array all with -1
        for(int i=0;i<n;i++){
            res[i]=-1;
        }
        for(int i=2*n-1;i>=0;i--){
            int num=nums[i%n];
            while (!st.isEmpty()&&st.peek()<=num) {
                st.pop();
            }
            if(i<n){
                if(!st.isEmpty()){
                    res[i]=st.peek();
                }
            }
            st.push(num);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] result = nextGreaterElements(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}