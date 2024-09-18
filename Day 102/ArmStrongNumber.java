/**
 * ArmStrongNumber
 */
public class ArmStrongNumber {

    public static void main(String[] args) {
        int num=153;
        System.out.println(isArmStrong(num));
    }

    private static boolean isArmStrong(int num) {
        int armNo=0;
        int original=num;
        while (num>0) {
            int digit=num%10;
            armNo+=Math.pow(digit, 3);
            num/=10;
        }
        return (original==armNo);
    }
}