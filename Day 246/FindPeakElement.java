public class FindPeakElement {
    public static int findPeakElement(int []arr){
        int low=0;
        int high=arr.length-1;
        int n=arr.length;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if((mid==0||arr[mid]>arr[mid-1])&& (mid==n-1)||arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>0&&arr[mid-1]>arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        System.out.println(findPeakElement(arr));

    }
}