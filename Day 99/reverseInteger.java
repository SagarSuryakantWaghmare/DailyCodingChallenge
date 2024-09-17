/**
 * reverseInteger
 */
public class reverseInteger {
    public static int reverse(int x){
        int result=0;
        while (x!=0) {
            int digit=x%10;
            int newResult=result*10+digit;
            if((newResult-digit)/10!=result){
                return 0;
            }
            result=newResult;
            x/=10;
        }
        return result;
    }

    public static void main(String[] args) {
        int n=145;
        System.out.println(reverse(n));
    }
}