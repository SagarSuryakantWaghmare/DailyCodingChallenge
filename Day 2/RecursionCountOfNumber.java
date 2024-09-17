import java.util.*;
public class RecursionCountOfNumber {

    static int countNumber(int n){
        if(n>=0&&n<=9){
            return 1;
        }
        return countNumber(n/10)+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("No of Count:"+countNumber(n));

    }
}