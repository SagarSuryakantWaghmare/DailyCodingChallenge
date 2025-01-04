public class countingBits{
    public static int[] countBit(int n){
        int res[]=new  int[n+1];
        for(int i=1;i<=n;i++){
            res[i]=res[i>>1]+(i&1);
        }
        return res;
    }
    public static void main(String[] args) {
        int n=5;
        int res[]=countBit(n);
        for (int i : res) {
            System.out.print(i);
        }
    }
}