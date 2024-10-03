/**
 * sortNumbers
 */
public class sortNumbers {
    public static int[] sort(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        // Make a loop for the 0 to n-1
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[i] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }

        return arr;
    }

    // Here we make the swap method to interchange the numbers it could me any of the low,mid or high
    public static void swap(int []arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 0, 1, 1, 2, 0, 1, 0, 2, 1, 0 };
        System.out.println("Before sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        int sorted[] = sort(arr);
        System.out.println();
        System.out.println("After Sorting:");
        for (int i : sorted) {
            System.out.print(i + " ");
        }
    }
}