public class maxProduct {
    public static int maxProduct(int[]arr){
        int max=arr[0];
        int min=arr[0];
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int tempMax=Math.max(current, Math.max(current*max, current*min));
            min=Math.min(current, Math.min(current*max  ,current*min));
            result=Math.max(result, max);
        }
        return result;
    }

    public static void main(String[] args) {
        int[]arr={1,-4,6,0};
        System.out.println(maxProduct(arr));
    }
}