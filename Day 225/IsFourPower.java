public class IsFourPower {
    public static boolean isFourPower(int n){
        //  if(n<=0) return false;
        //  while(n%4==0){
        //     n/=4;
        //  }
        //  return 1==n;

        // Method two method
        return n<=0 && (n& (n-1))==0 && (n-1)%3==0;
    }

    public static void main(String[] args) {
        int n=16;
        System.out.println(isFourPower(n));
    }
}