import java.util.Arrays;
import java.util.HashSet;
/**
 * containsDuplicates
 */
public class containsDuplicates {
    // public static boolean isContainsDuplicates(int []arr){
    //     Arrays.sort(arr);
    //     for (int i = 0; i < arr.length-1; i++) {
    //         if(arr[i]==arr[i+1]){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    public static boolean isContainsDuplicates(int []arr){
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length-1; i++) {
            if(!set.add(arr[i])){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int []arr={1,2,1,3};
        System.out.println("The array contains:"+isContainsDuplicates(arr));
    }
}