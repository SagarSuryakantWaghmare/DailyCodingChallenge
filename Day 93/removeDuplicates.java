/**
 * removeDuplicates
 */
public class removeDuplicates {

    public static void main(String[] args) {
        String s="abbccda";
        removeDuplicatesString(s,0,"");
        
    }
    public static boolean[]map=new boolean[26];

    private static void removeDuplicatesString(String s, int index, String newString) {
     if(index==s.length()){
        System.out.println(newString);
        return;
     }
     char currchar=s.charAt(index);
     if(map[currchar-'a']){
        removeDuplicatesString(s, index+1, newString);
     }
     else{
        newString+=currchar;
        map[currchar-'a']=true;
        removeDuplicatesString(s, index+1, newString);
     }
    }
}