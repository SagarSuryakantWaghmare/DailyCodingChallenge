import java.lang.reflect.GenericDeclaration;
import java.util.*;
public class RecursionGcd {

    // find the Gcd of the two numbers using the eulcid
    static int  Gcd(int m,int n){
        if(n==0){
            return m;
        }
        return Gcd(n,m%n);

    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number1:");
        int m=sc.nextInt();
        System.out.println("Enter the number2:");
        int n=sc.nextInt();
        System.out.println("Gcd:"+Gcd(m, n));
    }
}