/**
 * LongestPalindrome
 */

public class LongestPalindrome {
    public static boolean isPalindrome(String s,int i,int j){
        boolean flag=true;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                flag=false;
                break;
            }
            i++;
            j--;
        }
        return flag;
    }
public static String longestPalindrome(String s){
    // Find all the substring in the string
    if(s==null||s.length()<1){
        return "";
    }
    int start=0;
    int end=0;
    for(int i=0;i<s.length();i++){
        for (int j = i; j < s.length(); j++) {
            if(isPalindrome(s,i,j)&&(j-i+1)>(end-start+1)){
                start=i;
                end=j;
            }
        }
    }
    return s.substring(start, end+1);
}
}