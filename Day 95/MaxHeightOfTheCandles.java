/**
 * MaxHeightOfTheCandles
 */
public class MaxHeightOfTheCandles {

    public static void main(String[] args) {
        int[] candles = {3, 2, 1, 3};
        System.out.println(maxHeightOfTheCandles(candles));
    }

    private static int maxHeightOfTheCandles(int[] candles) {
        int count=0;
        int maxHeight=Integer.MIN_VALUE;
        for(int i=0;i<candles.length;i++){
            if(candles[i]>maxHeight){
                maxHeight=candles[i];
                count=1;
            }
            else if(candles[i]==maxHeight){
                count++;
            }
        }
        return count;
        
    }
}