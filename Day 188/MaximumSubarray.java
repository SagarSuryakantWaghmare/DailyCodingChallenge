public class MaximumSubarray {
    public static int maxSubarray(int []arr){
        if(arr.length==1) return arr[0];
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
          currSum=Math.max(arr[i], currSum+arr[i]);
          maxSum=Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubarray(arr));
    }
}