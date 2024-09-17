import java.util.Scanner;


public class RecursionMultiple {
    static void multiple(int n,int m){

        if(m==0){
            return ;
        }
        multiple(n, m-1);
        System.out.println(n*m);
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Enter the number:");
        int m=sc.nextInt();
        multiple(n, m);

    }
}
