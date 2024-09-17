
public class findingelementin2dmatrix {
   static int SearchInMatrix(int[][]arr,int target){
    int n=arr.length;
    int m=arr[0].length;
    int low=0;
    int high=arr.length-1;
    while (low<=high) {
        int mid=low+(high-low);
        int midElt=arr[mid/m][mid%m];
        if(midElt==target){
            return midElt;
        }
        if()
    }
    
   } 
   public static void main(String[] args) {
    int arr[][]={{1,2,4,5},{7,8,10,11},{14,16,18,20}};
    int target=8;
    SearchInMatrix(arr, target);
   }
}
