public class largestSumInMinimizedArray {
    public static int sum(int []nums,int s){
        int count=1;
        int sumCount=0;
        for (int i : nums) {
            if(sumCount+i<=s){
                sumCount=+i;
            }
            else{
                count++;
                sumCount=i;
            }
        }
        return count;
    }
    public static int largestSubarraySumMinimized(int[]nums,int k){
        int low=0;
        int high=0;
        for (int i : nums) {
            low=Math.max(low, i);
            high=+i;
        }
        while (low<=high) {
            int mid=low+(high-low)/2;
            int count=sum(nums,mid);
            if(count>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 5;
        System.out.println(largestSubarraySumMinimized(nums, k)); // Output: 5

    }
}