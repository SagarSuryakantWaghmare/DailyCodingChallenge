/**
 * firstAndLastOcc
 */
public class firstAndLastOcc {
    public static int[] occ(int []arr,int target){
       int res[]=new int[2];
       int firstIdx=-1;
       int lastIdx=-1;
       for(int i=arr.length-1;i>=0;i--){
        if(arr[i]==target&&lastIdx==-1){
            lastIdx=i;
        }
        if(arr[i]==target){
            firstIdx=i;
        }
       }
       res[0]=firstIdx;
       res[1]=lastIdx;
       return res;
    }

    public static void main(String[] args) {
       int arr[]={1,2,6,3,7,4,2,4,8,4};
       int ans[]=occ(arr,4);
       System.out.println("First occ "+ans[0]);
       System.out.println("Last occ "+ans[1]);
    }
}