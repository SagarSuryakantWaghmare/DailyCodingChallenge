import java.util.*;

/**
 * GenerateParenthesis
 */

public class GenerateParenthesis {

    // Helper method to recursively generate valid parentheses
    public static void parenthesis(String curr, int open, int closed, int total, List<String> ans) {
        // Base case: if the current string reaches the length of 2 * total, add it to the answer list
        if (curr.length() == 2 * total) {
            ans.add(curr);
            return;
        }

        // Recursive case: Add an open parenthesis if we still have open parentheses to add
        if (open < total) {
            parenthesis(curr + '(', open + 1, closed, total, ans);
        }

        // Recursive case: Add a closed parenthesis only if it will not exceed the open ones
        if (closed < open) {
            parenthesis(curr + ')', open, closed + 1, total, ans);
        }
    }

    // Main method to generate all combinations of well-formed parentheses
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        parenthesis("", 0, 0, n, ans); // Start the recursion with empty string and zero open/close count
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3)); // Example test case with n = 3
    }
}
