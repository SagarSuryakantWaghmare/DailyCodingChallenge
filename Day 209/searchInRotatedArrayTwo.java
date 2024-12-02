public class searchInRotatedArrayTwo {
    public static boolean search(int[]arr,int target){
        int left=0;
        int right=arr.length-1;
        while (left<right) {
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return true;
            }
            // if duplicates are present move the pointers to skip it
            if(arr[left]==arr[mid]&&arr[mid]==arr[right]){
                left++;
                right--;
            }
            // left half is sorted.
            else if(arr[left]<=arr[mid]){
                if(arr[left]<=target&&target<arr[mid]){
                    right=mid-1;
                }  
                else{
                    left=mid+1;
                } 
            }
            else{
                if(arr[mid]<target&&target<=arr[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 0, 1, 2};
        int target = 7;
        System.out.println(search(arr, target));
    }
}