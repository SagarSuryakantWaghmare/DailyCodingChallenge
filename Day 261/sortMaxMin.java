public class sortMaxMin{
    public static void sort(int []arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        int max=arr[j]+1;
        for (int k = 0; k < n; k++) {
            if(k%2==0){
                arr[k]=arr[k]+(arr[j]%max)*max;
                j--;
            }
            else{
                arr[k]=arr[k]+(arr[i]%max)*max;
                i++;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            arr[k]=arr[k]/max;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}