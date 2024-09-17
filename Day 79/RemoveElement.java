/**
 * RemoveElement
 */
public class RemoveElement {
    public static int removeElement(int[]nums,int val){
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
      int nums[]={3,2,2,3};
      int val=3;
      System.out.println(removeElement(nums, val));
    }
}