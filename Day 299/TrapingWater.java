public class TrapingWater {
    public static int trap(int[]height){
        int n=height.length;
        int low=0;
        int high=n-1;
        int leftmax=0;
        int rightmax=0;
        int water=0;
        while(low<=high){
            if(height[low]<height[high]){
                if(height[low]>leftmax){
                    leftmax=height[low];
                }
                else{
                    water+=leftmax-height[low];
                }
                low++;
            }
            else{
                if(height[high]>rightmax){
                    rightmax=height[high];
                }
                else{
                    water+=rightmax-height[high];
                }
                high--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));

    }
}