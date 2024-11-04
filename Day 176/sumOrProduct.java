public class sumOrProduct {
    public static long sumOrProduct(int n,int q){
        long sum=0;
        long product=1;
        long mod=1000000007;
        for(int i=1;i<=n;i++){
            sum=(sum+i)%mod;
            product=(product*i)%mod;
        }
        if(q==1){
            return sum;
        }
        else{
            return product;
        }
    }


    public static void main(String[] args) {
        int n=10;
        int q=2;
        System.out.println(sumOrProduct(n,q));
    }
}