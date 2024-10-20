/**
 * threeSum
 */
import java.lang.reflect.Array;
import java.util.*;
public class threeSum {
    public static List<List<Integer>> three(int[]arr){
        Arrays.sort(arr);
        List<List<Integer>> ans=new LinkedList<>();
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if(i>0&& arr[i]==arr[i-1])continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                 ans.add(Arrays.asList(arr[i],arr[j],arr[k]));
                 while (j < k && arr[j] == arr[j + 1]) j++;
                 while (j < k && arr[k] == arr[k - 1]) k--;
                 j++;
                 k--;
                }
                if(sum>0){
                    k--;
                }
                else{
                    j++;
                }
                j++;
                k--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(three(arr));
    }
}