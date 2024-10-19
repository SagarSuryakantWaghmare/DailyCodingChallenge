import java.util.HashMap;

/**
 * containsNearbyDuplicates
 */
public class containsNearbyDuplicates {
    public static boolean conatinsDuplicates(int[]arr,int k){
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hp.containsKey(arr[i])){
                int prev=hp.get(arr[i]);
                if((i-prev)<=k){
                    return true;
                }
            }
            hp.put(arr[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,1};
        System.out.println(conatinsDuplicates(arr,3));
    }
}