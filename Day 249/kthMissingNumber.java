public class kthMissingNumber {
    // public static int findKthPositive(int[]vec,int n,int k){
    //     for (int  i = 0; i < vec.length; i++) {
    //         if(vec[i]<=k){
    //             k++;
    //         }
    //         else{
    //             break;
    //         }
    //     }
    //     return k;
    // }
    public static int findKthPositive(int[]vec,int n,int k){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int missing=vec[mid]-(mid+1);
            if(missing<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return k+high+1;
    }

    public static void main(String[] args) {
        int []vec={4,7,9,10};
        int n=4;
        int k=4;
        System.out.println(findKthPositive(vec,n,k));
    }
}