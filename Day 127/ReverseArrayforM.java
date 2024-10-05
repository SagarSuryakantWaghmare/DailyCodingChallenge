/**
 * ReverseArrayforM
 */
public class ReverseArrayforM {
    public static void reverseArray(int []arr,int m){
        int low=arr.length-m;
        int high=arr.length-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        int m=2;
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Reverse Array:");
        reverseArray(arr,m);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}