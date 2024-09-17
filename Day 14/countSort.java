public class countSort {
    static void displayArr(int[] a) {
        for (int val : a) {
            System.out.print(val + " ");
        }
    }
    static int findMax(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void basicCountSort(int[]arr){
        int max=findMax(arr);//3 2 6 4 2 4 1 4 =6
        int[]count=new int[max+1];//arr[7]
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++]=i;
            } 
        }
    }

    public static void main(String[] args) {
       int arr[]={3,2,6,4,2,4,1,4};
       basicCountSort(arr);
       displayArr(arr);
    }
}
