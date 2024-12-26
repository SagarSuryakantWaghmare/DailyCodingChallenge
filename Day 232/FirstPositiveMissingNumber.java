public class FirstPositiveMissingNumber {
    public static int missing(int[] arr) {
        int n = arr.length;
        // First put the elements in the right place
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                swap(arr, i, arr[i] - 1);
            }
        }
        // Returning the first positive number
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("The first positive missing number is: " + missing(arr)); // Output: 2

        int[] arr2 = {1, 2, 0};
        System.out.println("The first positive missing number is: " + missing(arr2)); // Output: 3
    }
}