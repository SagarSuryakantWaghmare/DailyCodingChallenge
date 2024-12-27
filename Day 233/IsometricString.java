import java.util.HashMap;

public class IsometricString{
    private static boolean isIsometricString(String s,String t){
        if(s.length()!=t.length()){
                return false;
        }
        HashMap<Character,Character> sMap=new HashMap<>();
        HashMap<Character,Character> tMap=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(sMap.containsKey(sChar)&&sMap.get(sChar)!=tChar){
                return false;
            }
            if(tMap.containsKey(tChar)&&tMap.get(tChar)!=sChar){
                return false;
            }
            sMap.put(sChar, tChar);
            tMap.put(tChar  , sChar);
        }
        return true;
    }
    public static void main(String[] args) {
        String s="add";
        String t="egg";
        System.out.println(isIsometricString(s,t));
    }
}