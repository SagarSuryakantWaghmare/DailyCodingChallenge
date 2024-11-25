import java.util.*;
public class pow {
    public static double myPow(double x,int n){
        if(n==0){
            return 1.0;
        }
        long N=n;
        if(n<0){
          x=1/x;
          N=-N;
        }
        double result=1.0;
        double curr=x;
        while (N>0) {
            if(N%2==1){
                result*=curr;
            }
            curr*=curr;
            N/=2;
        }
        return result;
    }

    public static void main(String[] args) {
        double x=2.00000;
        int n=10;
        System.out.println(myPow(x,n));

    }
}