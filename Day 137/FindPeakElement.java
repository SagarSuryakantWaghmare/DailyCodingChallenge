/**
 * FindPeakElement
 */
public class FindPeakElement {
    public static int peakElement(int []arr){
        int low=0;
        int n=arr.length;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid==0||mid>mid-1&&mid==n-1||mid>mid+1){
                return mid;
            }
            if(arr[mid]<arr[mid-1]||mid<n-1){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        System.out.println("Peak element form the array:"+peakElement(arr));
    }
}