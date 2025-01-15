import java.util.HashSet;

public class LongestConsectiveNumber {
    public static int longest(int[]arr){
        int n=arr.length;
        int longest=1;
        HashSet<Integer> st=new HashSet<>();
        for (int i = 0; i < n; i++) {
            st.add(arr[i]);
        }
        for(int num:st){
            if(!st.contains(num-1)){
                int x=num;
                int count=1;
               while (st.contains(x+1)) {
                count++;
                x++;
               }
               longest=Math.max(count, longest);
            }

        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,100,101,102,103,104,6,4,5};
        System.out.println("Longest Consective Numbers:"+longest(arr));
    }
}