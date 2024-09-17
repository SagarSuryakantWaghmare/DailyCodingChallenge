public class quickSort {
    static void displayArr(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int count = 0;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <= pivot)
                count++;
        }
        int pivotIndex = start + count;
        swap(arr, start, pivotIndex);
        int i = start, j = end;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int pi = partition(arr, start, end);
        quickSort(arr, start, pi - 1);
        quickSort(arr, pi + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, 9, 10, 3, 2, 4, 20 };
        System.out.println("Array before sorting:");
        displayArr(arr);
        quickSort(arr, 0, arr.length-1);
        System.out.println();
        System.out.println("Array after sorting:");
        displayArr(arr);
    }
    // application of quicksort:java sort

}
