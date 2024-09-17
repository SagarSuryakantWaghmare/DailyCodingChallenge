public class stairs {
    static int Stairs(int n){
        if(n==1){
            return n;
        }
        int first=1;
        int second=2;
        for(int i=3;i<=n;i++){
            int third=first+second;
            first=second;
            second=third;
        }
        return second;
    }
    public static void main(String[] args) {
      System.out.println("No of staris:"+Stairs(4));  
    }
}
