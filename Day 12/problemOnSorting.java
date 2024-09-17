
public class problemOnSorting {
    public static void main(String[] args) {
        // Given an integer array arr,move all 0's to the end of it while maintaning the
        // realtive order of the non-zero elements.
        // Note that you must do this in place without making a copy of the array.
        // Input:0 5 0 3 42
        // output: 5 3 42 0 0
        int[] arr = { 0, 1, 3, 0, 4, 20 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
