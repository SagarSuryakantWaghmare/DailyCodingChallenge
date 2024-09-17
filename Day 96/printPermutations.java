/**
 * printPermutations
 */
public class printPermutations {

    public static void main(String[] args) {
        String s = "abc";
        printPermuation(s, "");
    }

    private static void printPermuation(String s, String permutation) {
        if(s.length()==0){
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            String newString = s.substring(0, i) + s.substring(i + 1);
            printPermuation(newString, permutation+currChar);
        }
    }
}