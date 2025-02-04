public class ReverseWords {
    public String reverseWords(String s) {
        String str = s.trim(); 
        String[] words = str.split("\\s+"); 
        StringBuilder sb = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" "); 
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseWords solution = new ReverseWords();
        String s = "  the sky  is   blue  ";
        System.out.println(solution.reverseWords(s));
    }
}
