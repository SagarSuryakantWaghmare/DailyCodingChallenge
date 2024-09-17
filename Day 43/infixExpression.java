import java.util.*;;

public class infixExpression {
    public static void main(String[] args) {
        // int x=9-5+3*4/6;
        // System.out.println(x);

        // We use two stacks for solving this equation
        // priority:multiplication,division,addition,subtraction
        // value and operation two stacks

        // In O(n) time complexity we get ans

        /*
         * 1/ch ->number val.push(ch)
         * 2.if(op.size()==0) op.push(ch)
         * 3.ch->op think for this
         * 
         * 48-57 ascii 0-9
         */

        // We can add the parenthesis
        // then 9-(5+3)*4/6
        // ans 5
        // there is no change only add the condition
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);// ch='5'
            int ascii = (int) ch;// ascii=53
            // 0->48 and 9->57
            if (ascii >= 48 && ascii <= 57) {
                // This important for the ascii form 0 to 9
                val.push(ascii - 48);
                // } else if (op.size() == 0)
                // op.push(ch);
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    // work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '-')
                        val.push((v1 - v2));
                    if (op.peek() == '+')
                        val.push((v1 + v2));
                    if (op.peek() == '*')
                        val.push((v1 * v2));
                    if (op.peek() == '/')
                        val.push((v1 / v2));
                    op.pop();
                }
                op.pop();
                // removing this (
            } else {
                if (ch == '+' || ch == '-') {
                    // Work to do
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '-')
                        val.push((v1 - v2));
                    if (op.peek() == '+')
                        val.push((v1 + v2));
                    if (op.peek() == '*')
                        val.push((v1 * v2));
                    if (op.peek() == '/')
                        val.push((v1 / v2));
                    // push
                    op.pop();
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        // work
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (op.peek() == '*')
                            val.push((v1 * v2));
                        if (op.peek() == '/')
                            val.push((v1 / v2));
                        // push
                        op.pop();
                        // push
                        op.push(ch);

                    } else
                        op.push(ch);
                }
            }
        }
        // val stack size-> 1
        while (val.size() > 1) {
            int v2 = val.pop();
            int v1 = val.pop();
            if (op.peek() == '-')
                val.push((v1 - v2));
            if (op.peek() == '+')
                val.push((v1 + v2));
            if (op.peek() == '*')
                val.push((v1 * v2));
            if (op.peek() == '/')
                val.push((v1 / v2));
            // push
            op.pop();

            // push

        }
        System.out.println(val.peek());
    }
}
