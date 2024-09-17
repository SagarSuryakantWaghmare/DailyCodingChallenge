public class FindPeakElement {
    static int findPeakElement(int[]a){
        int n=a.length;
        int low=0,high=n-1;
        while (low<=high) {
           int mid=low+(high-low)/2; 
           if(mid==0||a[mid]>a[mid-1]&&(mid==n-1||a[mid]>a[mid+1])){
            return mid;
           }
           if(a[mid]<a[mid+1]){
            low=mid+1;
           }else{
            high=mid-1;
           }
        }
    
    return -1;
    }
    public static void main(String[] args) {
        int a[]={1,3,2,1};
        System.out.println(findPeakElement(a));
    }
}
