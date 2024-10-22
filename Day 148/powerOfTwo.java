/**
 * powerOfTwo
 */
public class powerOfTwo {
    // O(1)
    // public static boolean isPowerOfTwo(int n){
    //     if(n==0) return true;
    //     for(int i=1;i<31;i++){
    //         int result=(int)i*i;
    //         if(result==n){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // O(logn)
    public static boolean isPowerOfTwo(int n){
        if(n<=0){
            return false;
        }
        while (n%2==0) {
            n/=2;
        }
        return n==1;
    }

    public static void main(String[] args) {
        int n=16;
        System.out.println(isPowerOfTwo(n));
    }
}