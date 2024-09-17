/*
 * There are N stones ,numbered 0,1,2...N-1.For each i(0<=i<N),the height of
 * stone i is hi.
 */
/*
 * There is a frog who is initially on stone 0.He will repeat the following
 * action some numbers of times to rach stone N-1
 */
/*Stone N-1:
 * If the frog is currently on stone i+2 or stone i+2
 * Here ,a cost of|hi-hJ|is incurred ,where j is the stone to land on.
* Find the minimum possible total cost incurred before the frog reaches stone N
 */
// Input n=4
// arr[]=10 30 40 20 
// output =30
public class RecursionProbem1 {
    static int best(int[] h, int n, int index) {
        if (index == n - 1)
            return 0;
        int op1 = best(h, n, index + 1) + Math.abs(h[index + 1] - h[index]);
        if (index == n - 2)
            return op1;
        int op2 = best(h, n, index + 2) + Math.abs(h[index + 2] - h[index]);
        return Math.min(op1, op2);
    }

    public static void main(String[] args) {
        int h[] = { 10, 30, 40, 20 };
        System.out.println(best(h, h.length, 0));
    }
}