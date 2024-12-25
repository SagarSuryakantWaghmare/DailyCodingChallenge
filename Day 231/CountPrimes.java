public class CountPrimes {
    public static int countPrime(int n){
        if(n<2) return 0;
        boolean []prime=new boolean[n+1];
        for(int i=2;i<n;i++){
            prime[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(prime[i]){
                for(int p=i*i;p<n;p+=i){
                    prime[i]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
          if(prime[i]){
            count++;
          }
        }
        return count;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(countPrime(n));
    }
}