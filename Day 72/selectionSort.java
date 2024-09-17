import java.util.Scanner;

/**
 * selectionSort
 */
public class selectionSort {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of the array:");
     int n=sc.nextInt();
     int arr[]=new int[n];
     for (int i = 0; i < n; i++) {
        arr[i]=sc.nextInt();
     }
     selection_sort(arr,n);
     for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");
     }
    }

    private static void selection_sort(int[] arr, int n) {
        // Take the i and last
        for (int i = 0; i < n-1; i++) {
            int midI=i;
            for (int j = i; j <=n-1; j++) {
                if(arr[j]<arr[midI]){
                    midI=j;
                }
            }
            int temp=arr[midI];
            arr[midI]=arr[i];
            arr[i]=temp;   
        }
        
    }
}