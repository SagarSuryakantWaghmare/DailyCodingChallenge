import java.util.*;
public class RecursionFactorial {
    static int factorial(int x){
        if(x==0){
            return 1;
        }
        return factorial(x-1)*x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for the factorial:");
        int f=sc.nextInt();
        System.out.println("Factorial of "+f+" : "+factorial(f));
    }
}
