

public class findingThemissingNumber {
   static int MissingNumber(int nums[]){
    int n=nums.length;
    int result=0;
    int sum=n*(n+1)/2;
    for(int num:nums){
        result+=num;
    }
    return sum-result;

   } 
   public static void main(String[] args) {
    int nums[] = {1,2,3,5,0};
    int n=MissingNumber(nums);
    System.out.println("Missing number:"+n);
   }
}
