/**
 * climbStairs
 */
public class climbStairs {
     public static int climb(int n){
        if(n==1){
            return 1;
        }
        int first=1;
        int second=2;
        for (int i = 3; i <=n; i++) {
           int third=first+second;
           first=second;
           second=third; 
        }
        return second;
     }
    public static void main(String[] args) {
        int n=4;
        System.out.println(climb(n));
    }
}