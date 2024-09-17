public class RecursiveSearch {

    static boolean Search(int []a,int target,int n,int index){

        if(index>=n) return false;
        if(a[index]==target) return true;
        return Search(a, target, n, index+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,8,10};
        int target=5;
        int n=arr.length;
        if(Search(arr, target, n, 0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}