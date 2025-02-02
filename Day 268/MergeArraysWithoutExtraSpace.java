public class MergeArraysWithoutExtraSpace {
    public static void merge(int[]a,int []b){
        int n=a.length-1;
        int m=b.length-1;
        int i=0;
        int j=0;
        while(i<=n &&j<=m){
            if(a[i]<b[j]){
                System.out.print(a[i]+" ");
                i++;
            }
            else{
                System.out.print(b[j]+" ");
                j++;
            }
        }
        while(i<=n){
            System.out.print(a[i]+" ");
            i++;
        }
        while(j<=m){
            System.out.print(b[j]+" ");
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        merge(arr1, arr2);

    }
}