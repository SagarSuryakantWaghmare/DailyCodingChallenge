/**
 * MaximumSubarray
 */
public class MaximumSubarray {
    public static int maxSubArray(int[]nums){
        int lastMax=0;
        int currMax=0;
        for (int i = 0; i < nums.length; i++) {
            lastMax=Math.max(nums[i], lastMax+nums[i]);
            currMax=Math.max(currMax,lastMax);
        }
        return currMax;
    }

    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}