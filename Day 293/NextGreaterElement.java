import java.util.Stack;

public class NextGreaterElement {

    private static int[] nextGreatest(int[] arr) {
        // optimal solution
        int nge[] = new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for (int i = arr.length-1; i>=0; i--) {
            while (!st.isEmpty()&&arr[i]>st.peek()) {
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]=-1;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }

        return nge;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 0, 8, 1, 3 };
        System.out.println("Array is as follows");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Next greatest element of the array:");
        int nge[] = nextGreatest(arr);
        for (int i : nge) {
            System.out.print(i + " ");
        }
    }

}
