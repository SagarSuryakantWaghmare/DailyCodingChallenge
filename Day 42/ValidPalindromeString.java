/**
 * ValidPalindromeString
 */
public class ValidPalindromeString {
    public static boolean isValidPalindrome(String s){
        String clearString=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left=0;
        int right=clearString.length()-1;
        while (left<right) {
            if(clearString.charAt(left)!=clearString.charAt(right)){
                return false;
            }
        
                left++;
                right--;
            }
        return true;

    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(isValidPalindrome(s1));
        String s = "race a car";;
        System.out.println(isValidPalindrome(s));
    }
}