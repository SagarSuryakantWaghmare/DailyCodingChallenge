public class RecurisivePrint {

    static void printArray(int arr[],int index){

        if(index==arr.length){
            return;
        }
        System.out.println(arr[index]);
        printArray(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[]={4,7,9,3,6};
        System.out.println("Array elements are as follows:");
        printArray(arr, 0);
    }
}