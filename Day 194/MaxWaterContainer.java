public class MaxWaterContainer {
    public static int maxArea(int[]height){
        int l=0;
        int r=height.length-1;
        int max=0;
        while (l<r) {
            int leftHeight=height[l];
            int rightHeight=height[r];
            int minHeight=Math.min(leftHeight,rightHeight);
            int width=r-l;
            int area=minHeight*width;
            max=Math.max(max, area);
            if(leftHeight<rightHeight){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7 };
        System.out.println("Max Area:"+maxArea(height));
    }
}