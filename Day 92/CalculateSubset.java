/**
 * CalculateSubset
 */
public class CalculateSubset {

    public static void main(String[] args) {
        int arr[]={1,2,3};
        calculateSubset(arr);
    }

    private static void calculateSubset(int[] arr) {
        int n=arr.length;
        int totalSubsets=(int)Math.pow(2, n);
        System.out.println(totalSubsets);
    }
}