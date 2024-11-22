public class FirstAndLastPositionIndex {
    public static int[] searchRange(int []nums,int target){
        int result[]=new int[2];
        result[0]=-1;
        result[1]=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                result[0]=i;
                break;
            }
        }
        if(result[0]!=-1);
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                result[1]=i;
                break;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int nums[]={3,2,2,4,5,6,2,8,2};
        int target=2;
        int[] result=searchRange(nums,target);
        System.out.println("First and Last Position of Target Element: "+result[0]+" "+result[1]);
    }
}