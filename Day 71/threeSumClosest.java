import java.util.Arrays;

/**
 * threeSumClosest
 */
public class threeSumClosest {

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int result = threeSumClosest(nums, target);
        System.out.println(result);
    }

    private static int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);
      int result=nums[0]+nums[1]+nums[2]; 
      int mindiff=Integer.MAX_VALUE;
      for (int i = 0; i < nums.length; i++) {
        int left=i+1;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[i]+nums[left]+nums[right];
            if(sum==target){
                return target;
            }
            if(sum<target){
                left++;
            }
            else{
                right--;
            }
            int difftarget=Math.abs(sum-target);
            if(difftarget<mindiff){
                result=sum;
                mindiff=difftarget;
            }
        }
      }
      return result;

    }
}