import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public static int profit(int[]arr){
        // Tabulazation method
        int n=arr.length;
        int[][]dp=new int[n+1][2];
        // intialize the entire dp
        for(int []row:dp){
            Arrays.fill(row, -1);
        }
        // base condition
        dp[n][0]=dp[n][1]=0;
        int profit=0;
        for(int ind=n-1;ind>=0;ind--){
            for(int buy=0;buy<=1;buy++){
                if(buy==0){
                    profit=Math.max(0+dp[ind+1][0], -arr[ind]+dp[ind+1][1]);
                }
                if(buy==1){
                    profit=Math.max(0+dp[ind+1][1], arr[ind]+dp[ind+1][0]);
                }
                dp[ind][buy]=profit;
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        int []arr={8,1,4,2,2,10};
        System.out.println(profit(arr));
    }
}