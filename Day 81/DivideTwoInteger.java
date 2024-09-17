/**
 * DivideTwoInteger
 */
public class DivideTwoInteger {

    public static void main(String[] args) {
        // Dividend=10 and divisor=3
        int dividend = 10;
        int divisor = 3;
        int result = divide(dividend, divisor);
        System.out.println("Result: " + result); // Should print 3
    }

    private static int divide(int dividend, int divisor) {
        // Special case to prevent overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert both dividend and divisor to positive
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int result = 0;

        // Using bit manipulation to perform the division
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            int multiple = 1;
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            absDividend -= tempDivisor;
            result += multiple;
        }

        // Apply the sign to the result
        return negative ? -result : result;
    }
}
