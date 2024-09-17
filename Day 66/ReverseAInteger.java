/**
 * ReverseAInteger
 */
public class ReverseAInteger {
    public int reverse(int x){
        int result=0;
        while(x!=0){
            int digit=x%10;
            int newResult=result*10+digit;
            if((newResult-digit)/10!=result){
                return 0;
            }
            result=newResult;
            x/=10;
        }
        return result;
    }
    public static void main(String[] args) {
        ReverseAInteger reverseInteger = new ReverseAInteger();
        
        // Test cases
        System.out.println(reverseInteger.reverse(123));  // Output: 321
        System.out.println(reverseInteger.reverse(-123)); // Output: -321
        System.out.println(reverseInteger.reverse(120));  // Output: 21
        System.out.println(reverseInteger.reverse(0));    // Output: 0
    }
    
}