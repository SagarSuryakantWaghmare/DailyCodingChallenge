public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int lastSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            lastSum=Math.max(nums[i],lastSum+nums[i]);
            currSum=Math.max(currSum,lastSum);
        }
        return currSum;
    }
    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(arr));
    }
}