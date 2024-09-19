/**
 * FindingMissingNumber
 */
public class FindingMissingNumber {
    public static int missingNumber(int[]arr,int n){
        int correctAns=n*(n+1)/2;
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        int missNo=correctAns-sum;
        return missNo;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,5};
        int n=5;
        System.out.println(missingNumber(arr, n));
    }
}