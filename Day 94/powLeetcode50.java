/**
 * powLeetcode50
 */
public class powLeetcode50 {

    public static void main(String[] args) {
        System.out.println("Pow :");
        int n=10;
        double x=2;
        System.out.println(pow(x,n));
        System.out.println(pow(2,-2));
    }

    private static double pow(double x, int n) {
        if(n==0){
            return 1.0;
        }
        long N=n;
        if(n<0){
            x=1/x;
            N=-N;
        }
        double result=1.0;
        double currResult=x;
        while (N>0) {
            if(N%2==1){
                result*=currResult;
            }
            currResult*=currResult;
            N/=2;
        }
        return result;
    }
}