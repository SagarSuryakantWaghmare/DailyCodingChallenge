/**
 * SearchInRotatedSortedArray
 */
public class SearchInRotatedSortedArray {

    public static int search(int []nums,int target){
        int left=0;
        int right=nums.length-1;
        while (left<=right) {
            int mid=left+(right-left);
            if(nums[mid]==target){
                return mid;
            }
            // Left side array is sorted.
            if(nums[left]<=nums[right]){
              if(nums[left]<=target && target<=nums[mid]){
                right=mid-1;
              }
              else{
                left=mid+1;
              }
            }
            else{
                if(nums[right]>=target&& target>=nums[mid]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
   return -1;
    }
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(nums, target));
    }
}