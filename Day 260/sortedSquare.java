public class sortedSquare {
    public static int[] sortSquare(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        int l=0;
        int r=arr.length-1;
        for(int i=n-1;i>=0;i--){
            if(Math.abs(arr[l])>Math.abs(arr[r])){
                res[i]=arr[l]*arr[l];
                l++;
            }
            else{
                res[i]=arr[r]*arr[r];
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { -4, -1, 0, 3, 9 };
        int res[] = sortSquare(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}