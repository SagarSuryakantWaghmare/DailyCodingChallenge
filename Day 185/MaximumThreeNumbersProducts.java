import java.util.Arrays;

public class MaximumThreeNumbersProducts {
    public static int maximumProduct(int []arr){
        Arrays.sort(arr);
        int n=arr.length;
        int postiveProduct=arr[n-1]*arr[n-2]*arr[n-3];
        int negativeProduct=arr[0]*arr[1]*arr[n-1];
        return Math.max(negativeProduct, postiveProduct);

    }

    public static void main(String[] args) {
        int arr[]={9,-2,-4,6,9,-2};
        System.out.println(maximumProduct(arr));
    }
}