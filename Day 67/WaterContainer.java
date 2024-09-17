/**
 * WaterContainer
 */
public class WaterContainer {
    // Leetcode 11.container with most water
    public static void main(String[] args) {
        int[] height = {2,6,4,5,3,5};
        int max=maxArea(height);
        System.out.println("Maximum area:"+max);

    }

    private static int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        while (l<r) {
            int leftHeight=height[l];
            int rightHeight=height[r];
            int minHeight=Math.min(leftHeight, rightHeight);
            int width=r-l;
            int area=width*minHeight;
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
}