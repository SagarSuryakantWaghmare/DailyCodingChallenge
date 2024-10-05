/**
 * validPalindromeString
 */
public class validPalindromeString {
    public static boolean validPalindrome(String s){
        String clear=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left=0;
        int right=clear.length()-1;
        while (left<right) {
            if(clear.charAt(left)!=clear.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(validPalindrome(s));
    }
}