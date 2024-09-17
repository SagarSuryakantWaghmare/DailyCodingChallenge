public class RecurisiveSum {

    static int maxInArray(int []arr,int index){
        if(index==arr.length){
            return 0;
        }
        // small work
        int smallAns=maxInArray(arr, index+1);
        // self work
        return smallAns+arr[index];
    }
    public static void main(String[] args) {
        int arr[]={2,7,4,9,10};
        System.out.println("Max element form the array:");
        System.out.println(maxInArray(arr, 0));
    }
}