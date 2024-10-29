/**
 * MoveZeroes
 */
public class MoveZeroes {
    public static void moveZeroes(int []arr){
        int n=arr.length;
        int lastZero=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[lastZero++]=arr[i];
            }
        }
        for(int i=lastZero;i<n;i++){
            arr[i]=0;
        }
    }

    public static void main(String[] args) {
        int []arr={0,1,2,0,4,5,0};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Move zeroes to the end");
        moveZeroes(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}