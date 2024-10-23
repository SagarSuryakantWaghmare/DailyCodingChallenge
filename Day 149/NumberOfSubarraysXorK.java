import java.util.HashMap;

/**
 * NumberOfSubarraysXorK
 */
public class NumberOfSubarraysXorK {
    public static int numberOfSumArray(int []arr,int k){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int count=0;
        int xor=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
                        xor^=arr[i];
            if(xor==k){
                count++;
            }
            if(mp.containsKey(xor^k)){
                count+=mp.get(xor^k);
            }
            mp.put(xor, mp.getOrDefault(xor, 0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int []arr={4,2,2,6,4};
        int k=6;
        System.out.println(numberOfSumArray(arr, k));
    }
}