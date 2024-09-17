public class RecurisiveMax {

    static int maxInArray(int arr[],int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int smallAns=maxInArray(arr, index+1);
        return Math.max(arr[index], smallAns);
    }
    public static void main(String[] args) {
        int arr[]={2,8,4,60,10,40};
        System.out.println("Max for the array:");
        System.out.println(maxInArray(arr, 0));
        
    }
}