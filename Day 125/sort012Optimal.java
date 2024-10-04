/**
 * sort012Brute
 */
public class sort012Optimal {
    public static void swap(int []arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void sortBrute(int[]arr){
       int low=0;
       int mid=0;
       int high=arr.length-1;
       while (mid<=high) {
        
           if(arr[mid]==0){
               swap(arr,low,mid);
               low++;
               mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
       }
    

    public static void main(String[] args) {
        int arr[]={0,1,2,0,0,1,1,2,2,0,2,0};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        sortBrute(arr);
        System.out.println("Sorting:");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}