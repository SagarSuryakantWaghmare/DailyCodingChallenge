import java.util.Arrays;

public class FindMajorityElement {
    public static int majority(int []arr){
        // here the time complexity of the this method is O(nlogn)

        Arrays.sort(arr);
        int n=arr.length;
        return arr[n/2];

        // Can we do in the o(n)
       
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,4,4,3,4,2,4,4,4,8,10,4,4,4};
        System.out.println("Majority elements:"+majority(arr));
    }
}
