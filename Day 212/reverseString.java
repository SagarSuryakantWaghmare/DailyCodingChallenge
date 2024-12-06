import java.util.*;
public class reverseString {
    public static String reverseStringWords(String s){
        String[]words=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String s="Sagar can do anything";
        System.out.println(reverseStringWords(s));
    }
}