/**
 * longestSubarrayK
 */
public class longestSubarrayK {
    public static void longestSubarray(int []a,int k){
     int left=0;
     int right=0;
     int sum=a[0];
     int maxLen=0;
     int n=a.length;
     while (right<n) {
        while (left<=right&&sum>k) {
            sum-=a[left];
            left++;
        }
        if(sum==k){
            maxLen=Math.max(maxLen, right-left+1);
        }
        right++;
        if(right<n){
            sum+=a[right];
        }
     }
     System.out.println(maxLen);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,4,2,3};
        int target=3;
        longestSubarray(arr,target);
    }
}