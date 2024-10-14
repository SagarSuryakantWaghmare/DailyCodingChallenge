import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * reverseImage
 */
public class reverseImage {
    public static boolean isReverseImage(String s){
        Set<Character> mirror=new HashSet<>(Arrays.asList('A','H','I','M','N','O','T','U','V','W','X','Y'));
        for(char c:s.toCharArray()){
            if(!mirror.contains(c)){
                return false;
            }
        }
        int low=0;
        int high=s.length()-1;
        while (low<=high) {
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
        
    }

    public static void main(String[] args) {
        String s="XYX";
        System.out.println("Reverse Image:"+isReverseImage(s));
    }
}