import java.util.Scanner;

public class complexPattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int h=0;
		int n =sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            } 
            h=i;
            for(int j=1;j<=i;j++){
                System.out.print(h++);
            }
            h=i;
            for(int j=1;j<=i-1;j++){
                System.out.print(h--);
            }
            System.out.println();
		}
	}
}
