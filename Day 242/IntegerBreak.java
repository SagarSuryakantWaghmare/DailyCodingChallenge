public class IntegerBreak {
    public static int integerBreak(int n){
        if(n==2||n==3){
            return n-1;
        }
        int product=1;
        while (n>4) {
            n-=3;
            product*=3;
        }
        return product*n;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(integerBreak(n));
    }
}