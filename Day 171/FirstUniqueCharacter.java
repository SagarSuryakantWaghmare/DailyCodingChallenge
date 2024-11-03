public class FirstUniqueCharacter {
    public static int firstUniqChar(String s){
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(firstUniqChar(s));
    }
}