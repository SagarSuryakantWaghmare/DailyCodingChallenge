import java.util.Scanner;

public class RecursionPower {
    static int power(int n,int p){
        if(p==0){
            return 1;
        }
        return power(n, p-1)*n;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Enter the power of number:");
        int p=sc.nextInt();
        System.out.println("No of Count:"+power(n,p));

    }
}
