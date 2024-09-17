public class power {
  
        public static void main(String[] args) {
            System.out.println(pow(2.00000, 10)); // Output: 1024.00000
            System.out.println(pow(2.10000, 3));  // Output: 9.26100
            System.out.println(pow(2.00000, -2)); // Output: 0.25000
        }
    
        public static double pow(double x, int n) {
            if (n == 0) {
                return 1.0;
            }
            if (n < 0) {
                x = 1 / x;
                n = -n;
            }
            double result = 1.0;
            double currentProduct = x;
            while (n > 0) {
                if (n % 2 == 1) {
                    result *= currentProduct;
                }
                currentProduct *= currentProduct;
                n /= 2;
            }
            return result;
        }
    
    
}
