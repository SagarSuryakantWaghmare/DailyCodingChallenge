import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        
        int[]arr={1,3,2,1,8,6,3,4};
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[]res=new int[arr.length];
        for(int i=n-2;i>=0;i--){
            while(st.peek()<arr[i]&& st.size()>0){
                st.pop();
            }
            if(st.size()==0) res[i]=-1;
            else res[i]=st.peek();
            st.push(arr[i]);
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]+" ");
        }
    }

}
