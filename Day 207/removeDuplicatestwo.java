public class removeDuplicatestwo {
    public static int removeDuplicate(int[] arr) {
        int l = 0;
        int r = 0;
        while (r < arr.length) {
            int count = 1;
            while (r + 1 < arr.length && arr[r] == arr[r + 1]) {
                r++;
                count++;
            }
            for (int i = 0; i < Math.min(count, 2); i++) {
                arr[l] = arr[r];
                l++;
            }

            r++;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 4, 5 };
        System.out.println(removeDuplicate(arr));
    }
}