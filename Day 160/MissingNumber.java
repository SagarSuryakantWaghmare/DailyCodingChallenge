/**
 * MissingNumber
 */
public class MissingNumber {
    public static int missingNumber(int []arr){
        int actualSum=0;
        int n=arr.length;
        int expectedSum=n*(n+1)/2;
        for (int i : arr) {
            actualSum+=i;
        }
        return expectedSum-actualSum;
    }

    public static void main(String[] args) {
        int []nums={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
}