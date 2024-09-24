/**
 * mySqrt
 */
public class mySqrt {
    public static int mySqurt(int x){
       if(x<2){
        return x;
       }
       int left=1;
       int right=x/2;
       int result=0;
       while(left<=right){
        int mid=left+(right-left)/2;
        long square=(long)mid*mid;
        if(x==square){
            return mid;
        }
        else if(square<x){
            left=mid+1;
            result=mid;
        }
        else{
            right=mid-1;
        }
       }
       return result;
    }

    public static void main(String[] args) {
        System.out.println(mySqurt(4));
    }
}