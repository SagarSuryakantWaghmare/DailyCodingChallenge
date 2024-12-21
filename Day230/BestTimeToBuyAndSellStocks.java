public class BestTimeToBuyAndSellStocks {
    public static int profit(int []arr){
        int min=arr[0];
        int maxProfit=0;
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
            int result=arr[i]-min;
            maxProfit=Math.max(maxProfit, result);
            
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int []arr={8,1,4,2,2,10};
        System.out.println(profit(arr));
    }
}