import java.util.ArrayList;
import java.util.Scanner;

public class nextPermutation {
    public static void swap(ArrayList<Integer> a, int s, int e) {
        int temp = a.get(s);
        a.set(s, a.get(e));
        a.set(e, temp);
    }

    public static void reverse(ArrayList<Integer> a, int low, int high) {
        while (low < high) {
            int temp = a.get(low);
            a.set(low, a.get(high));
            a.set(high, temp);
            low++;
            high--;
        }
    }

    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {
        int n = permutation.size();
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (permutation.get(i) < permutation.get(i + 1)) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            reverse(permutation, 0, n - 1);
            return permutation;
        }
        for (int i = n - 1; i > idx; i--) {
            if (permutation.get(i) > permutation.get(idx)) {
                swap(permutation, idx, i);
                break;
            }
        }
        reverse(permutation, idx + 1, n - 1);

        return permutation;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int n = sc.nextInt();
        ArrayList<Integer> permutation = new ArrayList<>();

        System.out.println("Enter the elements of the list: ");
        for (int i = 0; i < n; i++) {
            permutation.add(sc.nextInt());
        }
        ArrayList<Integer> result = nextPermutation(permutation);

        System.out.println("Next permutation: " + result);

        sc.close();
    }
}
