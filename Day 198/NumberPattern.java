public class NumberPattern {
    public static void printPattern(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            count = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(count++);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
}