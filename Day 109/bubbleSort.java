/**
 * bubbleSort
 */
public class bubbleSort {
    public static void bubble(int[]arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={3,1,9,2,10};
        int n=5;
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Bubble sort :");
        bubble(arr,n);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}