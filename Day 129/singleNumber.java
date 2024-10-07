/**
 * singleNumber
 */
public class singleNumber {
    public static int singleNumber(int []arr){
        if(arr.length==1){
            return arr[0];
        }
        int single=0;
        for (int i = 0; i < arr.length; i++) {
            single^=arr[i];
        }
        return single;
    }

    public static void main(String[] args) {
        int arr[]={2,2,4,4,8};
        System.out.println(singleNumber(arr));
    }
}