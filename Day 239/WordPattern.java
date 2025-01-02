import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern( String pattern, String s){
        String words[]=s.split(" ");
        if(words.length!=pattern.length()){
            return false;
        }
        HashMap<Character,String> charToWord=new HashMap<>();
        HashMap<String,Character> wordToChar=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String word=words[i];
            if(charToWord.containsKey(c)){
                if(!charToWord.get(c).equals(word)){
                    return false;
                }

            }
            else{
                charToWord.put(c, word);
            }
            if(wordToChar.containsKey(word)){
                if(!wordToChar.get(word).equals(c)){
                    return false;
                }

            }
            else{
                wordToChar.put(word,c);
            }

        }

        return true;
    }

    public static void main(String[] args) {
        // Here is the main function
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(wordPattern(pattern, str));
    }
}