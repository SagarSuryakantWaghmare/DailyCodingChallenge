public class FindingMaxElementInString {

    public static void main(String[] args) {
        String str = "Welcome to the world of Java";
        String[] words = str.split(" ");
        String max = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > max.length()) {
                max = words[i];
            }
        }
        System.out.println("The word with the maximum length is: " + max);
    }
}