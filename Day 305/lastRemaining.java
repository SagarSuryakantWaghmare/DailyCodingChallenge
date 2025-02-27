public class lastRemaining{
    public static int lastOnes(int n){
        int head=1;
        int step=1;
        boolean leftToRight=true;
        while (n>1) {
            if(leftToRight||n%2==1){
               head+=step;
            }
            step*=2;
            n/=2;
            leftToRight=!leftToRight;
        }
        return head;

    }
    public static void main(String[]args){
        int n=10;
        System.out.println(lastOnes(n));
    }
}