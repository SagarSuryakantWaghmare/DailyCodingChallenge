public class ThirdMaximumNumber {
    public static int thirdMax (int []arr){
        Integer first=null;
        Integer second=null;
        Integer third=null;
        for( Integer num:arr){
            if(num.equals(first) || num.equals(second) || num.equals(third)){
                continue;
            }
            if(first == null || num > first){
                third=second;
                second=first;
                first=num;
            }
            else if(second == null || num > second){
                third=second;
                second=num;
            }
            else if(third == null || num > third){
                third=num;
            }
        }
        return third==null?first:third;
    }

    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       System.out.println(thirdMax(arr));

    }
}