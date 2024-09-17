import java.util.HashSet;
import java.util.Set;

// Comments get for the chatgpt

/**
 * lengthOfLongestSubstring
 */
public class lengthOfLongestSubstring {
    // Brute force: We could generate all possible substrings and check their lengths,
    // but that would be inefficient. Instead, we'll use the sliding window technique.

    // Sliding window approach using a Set to store characters. The Set helps in 
    // ensuring that there are no duplicate characters in the current substring.
    
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0; // Two pointers for the sliding window: left and right
        Set<Character> lonely = new HashSet<>(); // Set to store unique characters in the current window
        int max = 0; // Variable to store the length of the longest substring without repeating characters
        
        // Iterate through the string using the right pointer
        while (right < s.length()) {
            char c = s.charAt(right); // Get the current character at the right pointer
            
            // If the character is not already in the set, add it to the set and update max length
            if(lonely.add(c)) {
                max = Math.max(max, right - left + 1); // Update the max length if the current window is longer
                right++; // Move the right pointer to expand the window
            } 
            // If the character is already in the set, we have a duplicate
            else {
                // Move the left pointer to remove characters until the duplicate is removed
                while (s.charAt(left) != c) {
                    lonely.remove(s.charAt(left)); // Remove characters from the set as we shrink the window
                    left++; // Move the left pointer to shrink the window
                }
                lonely.remove(c); // Remove the duplicate character from the set
                left++; // Move the left pointer to continue finding the next valid substring
            }
        }
        
        return max; // Return the maximum length of the substring found
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring solution = new lengthOfLongestSubstring();
        String testString = "abcabcbb";
        System.out.println("Length of the longest substring without repeating characters: " + solution.lengthOfLongestSubstring(testString));
    }
}
