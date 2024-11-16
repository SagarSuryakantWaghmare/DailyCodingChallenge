import java.util.HashMap;

public class IsometricString {
    public static boolean isIsometric(String s1, String s2) {
        // Here we go step by step
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character,Character> s1M=new HashMap<>();
        HashMap<Character,Character>  s2M=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char sChar=s1.charAt(i);
            char tChar=s2.charAt(i);
            if(s1M.containsKey(sChar)&&s1M.get(sChar)!=tChar){
                return false;
            }
            if(s2M.containsKey(tChar)&&s2M.get(tChar)!=sChar){
                return false;
            }
            s1M.put(sChar, tChar);
            s2M.put(tChar, sChar);
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "amazon";
        String s2 = "bnbjms";
        System.out.println(isIsometric(s1, s2));

    }
}