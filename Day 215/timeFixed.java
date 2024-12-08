import java.util.HashMap;

public class timeFixed {
    public static int checkTime(int[]arr){
        int count=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int rem=arr[i]%60;
            int comp=(60-rem)%60;
            if(mp.containsKey(comp)){
                count+=mp.get(comp);
            }
            mp.put(rem, mp.getOrDefault(rem, 0)+1);
        }
        return count++;
    }

    public static void main(String[] args) {
        int []arr={30,60,90,120,150};
        System.out.println(checkTime(arr));
    }
}