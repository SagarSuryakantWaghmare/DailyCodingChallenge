import java.util.ArrayList;

public class RecursiveFindAllIndexArrayList {
    static ArrayList<Integer>allIndex(int a[],int target,int n,int index){

        if(index>=n){
            return new ArrayList<Integer>();//empty array
        }
        ArrayList<Integer>ans=new ArrayList<>();
        if(a[index]==target){
            ans.add(index);
        }
        ArrayList<Integer>smallAns=allIndex(a, target, n, index+1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        int a[]={3,2,5,2,7,2,8,6,2};
        int target=2;
        int n=a.length;
        ArrayList<Integer>ans=allIndex(a, target, n, 0);
        for (Integer i:ans){
            System.out.println(i);
        }
    }
}
