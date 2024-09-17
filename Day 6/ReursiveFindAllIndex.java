public class ReursiveFindAllIndex {
    static void findAllIndex(int a[],int n,int target,int index){
        if(index>=n){
            return ;
        }
        if(target==a[index]){
            System.out.println(index);
        }
        findAllIndex(a, n, target, index+1);
    }
    public static void main(String[] args) {
       int a[]={4,5,8,2,9,2,10,2};
       int n=a.length;
       int target=2; 
       findAllIndex(a, n, target, 0);
    }
}
