import java.util.LinkedHashMap;
import java.util.Map;

import javax.net.ssl.HandshakeCompletedEvent;

public class OptimizeTwoSum {
    // Queus:Two sum.
    /*
     * Given an array of length n and a target ,return a pair(indices) whose
     * sum is equal to the target.If there is no pair present ,return -1.
     * Input:
     * n=4
     * arr[]={1,5,7,-1}
     * target=6
     * output:
     * 0 1
     */
    public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int ans[]={-1};
        Map<Integer,Integer> mp=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            int partner=target-nums[i];
            // Then we use the inbuilt
            if(mp.containsKey(partner)){
                ans=new int[]{i,mp.get(partner)};
                return ans;
            } 
            mp.put(nums[i], i);
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, -1 };
        int target = 6;
        int ans[] = twoSum(arr, target);
        for (int i : ans) {
            System.out.print(i + " ");
        }

    }
}

