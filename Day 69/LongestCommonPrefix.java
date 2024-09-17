import java.util.Arrays;

/**
 * LongestCommonPrefix
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefixA(String[]strs){
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int index=0;
        while (index<s1.length()&&index<s2.length()) {
            if(s1.charAt(index)==s2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        return s1.substring(0, index);
    
    }
    public static void main(String[] args) {
        String strs[]={"flower","flow","flight"};
        System.out.println(longestCommonPrefixA(strs));

    }
}