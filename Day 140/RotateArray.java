/**
 * RotateArray
 */
public class RotateArray {
    public static void rotate(int[]arr,int k) {
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void reverse(int[]arr,int start,int end){
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8};
        int k=3;
        for (int i : nums) {
            System.out.print(i+" ");
        }
        rotate(nums,k);
        System.out.println();
        System.out.println("Rotating the array:");
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}