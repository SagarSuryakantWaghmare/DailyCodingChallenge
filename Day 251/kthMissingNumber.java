public class kthMissingNumber {
    public static int findKthPositive(int[]arr,int k){
        int low=0;
        int high=arr.length-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            int missingNumber=arr[mid]-(mid+1);
            if(missingNumber<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return k+high+1;
    }

      public static void main(String[] args) {
        int arr[] = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
      }
}