import java.util.*;
public class RecursionSumOfDigit {

    // Sum of digits
    static int sumOfDigit(int n){
        if(n==0){
            return n;
        }
        // f(n)=n/10+n%10;
        return sumOfDigit(n/10)+n%10;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which number sum you want:");
        int n=sc.nextInt();
        System.out.println("Sum of number:"+sumOfDigit(n));

    }
}
