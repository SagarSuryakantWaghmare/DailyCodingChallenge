public class findingSquareRoot {
    public static int squareroot(int num){
        int low=0;
        int high=num;
        int result=0;
        while (low<=high) {
            int mid=low+(high-low)/2;
            long square=(long) mid*mid;
            if(square==num){
                return mid;
            }
            else if(square<num){
                low=mid+1;
                result=mid;
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int num=18;
        System.out.println(squareroot(num));
    }
}
