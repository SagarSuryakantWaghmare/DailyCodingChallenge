public class countShippingDays {
        public static int findCount(int days, int weight[]) {
            int day = 0;
            int count = 1;
            for (int i = 0; i < weight.length; i++) {
                if (day + weight[i] > days) {
                    count++;
                    day = weight[i];
                } else {
                    day += weight[i];
    
                }
            }
            return count;
        }
    
        public static int shipWithinDays(int[] weights, int days) {
            int low = Integer.MIN_VALUE;
            int high = 0;
            for (int i = 0; i < weights.length; i++) {
                low = Math.max(low, weights[i]);
                high += weights[i];
            }
            while (low <= high) {
                int mid = low + (high - low) / 2;
                int count = findCount(mid, weights);
                if (count <= days) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return low;
        }
        public static void main(String[] args) {
           int[] weights = {1,2,3,4,5,6,7,8,9,10};
           int days = 5;
           System.out.println(shipWithinDays(weights, days));
        }
    
}