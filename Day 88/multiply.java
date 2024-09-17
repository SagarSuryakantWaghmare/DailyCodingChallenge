import java.math.BigInteger;

/**
 * multiply
 */
public class multiply {

    public static String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger ans = n1.multiply(n2);
        return ans.toString();
    }

    public static void main(String[] args) {
        String n1 = "2";
        String n2 = "3";
        String result = multiply(n1, n2);
        System.out.println(result);

    }
}