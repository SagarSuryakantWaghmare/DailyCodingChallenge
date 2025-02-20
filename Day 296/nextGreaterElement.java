import java.util.HashMap;
import java.util.Stack;

public class nextGreaterElement {
    public static void printArray(int[]arr){
        for (int q : arr) {
            System.out.print(q+" ");
        }
        System.out.println();
    }
    public static int[] nextGreater(int[]nums1,int nums2[]){
       int n1=nums1.length;
       int n2=nums2.length;
       int ans[]=new int[n1];
       Stack<Integer> st=new Stack<>();
       HashMap<Integer,Integer> mp=new HashMap<>();
       for(int i=n2-1;i>=0;i--){
        int num=nums2[i];
        while (!st.isEmpty()&&st.peek()<=num) {
            st.pop();
        }
        mp.put(num, st.isEmpty()?-1:st.peek());
        st.push(num);
       }
       for (int i = 0; i < n1; i++) {
        ans[i]=mp.get(nums1[i]);
       }
       return ans;
    }

    public static void main(String[] args) {
        int nums1[]={4,1,2};
        int nums2[]={1,3,4,2};
        printArray(nums1);
        System.out.println("Next greater element:");
        int nge[]=nextGreater(nums1,nums2);
        printArray(nge);
    }
}