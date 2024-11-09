public class FibonacciNumbers {
    public static int fib(int n){
        if(n<=1){
            return 1;
        }
        int last=fib(n-1);
        int slast=fib(n-2);
        return last+slast;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(fib(n));
    }
}