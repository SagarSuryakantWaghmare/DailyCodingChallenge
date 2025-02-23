public class sumOfSubarrayMinimum {
    public static int sumofMins(int []arr){
        int sum=0;
        int mod=(int)1e9+7;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            int min=arr[i];
            for (int j = i; j < n; j++) {
                min=Math.min(min, arr[j]);
                sum+=min;
                min%=mod;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[]={3,1,2,4};
        System.out.println(sumofMins(arr));
    }
}