import java.util.HashMap;

/**
 * CountSubarray
 */
public class CountSubarray {
    public static int countSubarray(int[]arr,int k){
        int count=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0, 1);
        int preSum=0;
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            int remove=preSum-k;
            if(mp.containsKey(remove)){
                count+=mp.get(remove);
            }
            mp.put(preSum, mp.getOrDefault(preSum, 0)+1);
        }
        return count++;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,-3,1,1,1,4,2,-3};
        int k=3;
        System.out.println(countSubarray(arr,k));
    }
}