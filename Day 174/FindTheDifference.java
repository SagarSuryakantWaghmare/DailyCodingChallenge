public class FindTheDifference {
    public static char findTheDifference(String s,String t ){
        char diff=0;
        for(int i=0;i<s.length();i++){
         diff^=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            diff^=t.charAt(i);
        }
        return diff;

    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
}