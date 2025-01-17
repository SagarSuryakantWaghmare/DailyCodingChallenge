public class MedianOfTwoSorted {
    public static double median(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int n = n1 + n2;
        if (n1 > n2)
            return median(b, a);
        int left = (n1 + n2 + 1) / 2;
        int low = 0;
        int high = n1;
        int mid1 = n / 2;
        int mid2 = left - mid1;
        while (low <= high) {
            
            int l1=mid1>0?a[mid1-1]:Integer.MIN_VALUE;
            int l2=mid2>0?b[mid2-1]:Integer.MIN_VALUE;
            int r1=mid1<n1?a[mid1]:Integer.MAX_VALUE;
            int r2=mid2<n2?b[mid1]:Integer.MAX_VALUE;
            if(l1<=r2&&l2<=r1){
                if(n%2==1){
                    return Math.max(l1, l2);
                }
                else{
                    return (Math.max(l1, l2)+Math.min(r1, r2))/2.0;
                }
            }
            else if(l1>r2){
                high=mid1-1;
            }
            else{
                low=mid1+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 8, 9, 15 };
        int arr2[] = { 7, 11, 18, 19, 21, 25 };
        System.out.println("Median of the two sorted array" + median(arr1, arr2));
    }
}