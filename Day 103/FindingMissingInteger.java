public class FindingMissingInteger {
    // public static void missingNumber(int[]arr,int n){
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]!=i+1){
    //             System.out.println(i+1);
    //             return;
    //         }
    //     }
    //     System.out.println(n);
    // }

    // updated one
    public static void missingNumber(int[]arr,int n){
        for(int i=0;i<arr.length-1;i++){
            if(1+arr[i]!=arr[i+1]){
                System.out.println(arr[i+1]);
                return;
            }
        }
        System.out.println(1+arr[arr.length-1]);
    }
    public static void main(String[] args) {
        // int arr[]={1,2,3,5};
        // int arr[]={0,1,2,3};
        int arr[]={-2,-1,0,1};
        
        int n=5;
        missingNumber(arr,n);
    }
}
