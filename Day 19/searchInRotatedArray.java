
public class searchInRotatedArray {
    static int search(int[]nums,int target){
        int left=0,right=nums.length-1;
        while (left<=right) {
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[left]<=nums[right]){
                if(nums[left]<=target && target<=nums[mid]){
                  right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }else{
                if(nums[mid]<target && target<=nums[right]){
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
      int[]nums={4,5,6,7,0,1,2,3};
      int target=4;
      System.out.println(search(nums, target));   
    }
}
