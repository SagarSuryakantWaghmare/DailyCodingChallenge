/**
 * getPrime
 */
public class getPrime {
    public static int getprime(int n){
        int[]primeDivisors=new int[n+1];
        for(int p=2;p<=n;p++){
            if(primeDivisors[p]==0){
                for(int mul=p;mul<=n;mul+=p){
                    primeDivisors[mul]++;
                }
            }
        }
        int count=0;
        for(int i=2;i<=n;i++){
            if(primeDivisors[i]==2){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(getprime(n));
    }
}