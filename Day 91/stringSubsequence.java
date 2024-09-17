/**
 * stringSubsequence
 */
public class stringSubsequence {

    public static void main(String[] args) {
    String s="abc";
    printSubsequence(s,0,"");
    }
    private static void printSubsequence(String str,int index,String newsString) {
        if(index==str.length()){
            System.out.println(newsString);
        }
        char currChar=str.charAt(index);
        // to be 
        printSubsequence(str, index+1, newsString+currChar);
        // or not to be
        printSubsequence(str, index+1, newsString);
    }
}