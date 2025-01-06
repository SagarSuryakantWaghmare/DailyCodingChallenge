public class SearchInsertPosition {
    public static int insert(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]<target){
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                return mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        
        int arr[]={1,4,7,8,10};
        int target=5;
        System.out.println(insert(arr,target));
    }
}