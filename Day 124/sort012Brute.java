/**
 * sort012Brute
 */
public class sort012Brute {
    public static void sortBrute(int[]arr){
        int s0=0;
        int s1=0;
        int s2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
             s0++;
            }
            else if(arr[i]==1){
                s1++;
            }
            else {
                s2++;
            }
        }
        for(int i=0;i<s0;i++){
            arr[i]=0;
        }
        for(int i=s0;i<s0+s1;i++){
            arr[i]=1;
        }
        for(int i=s0+s1;i<s0+s1+s2;i++){
            arr[i]=2;
        }
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,0,0,1,1,2,2,0,2,0};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        sortBrute(arr);
        System.out.println("Sorting:");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}