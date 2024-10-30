/**
 * NimGame
 */
public class NimGame {
    // public static boolean canWinNim(int n){
    // if(n<=3){
    // return true;
    // }
    // return !canWinNim(n-1)&&!canWinNim(n-2)&&!canWinNim(n-3);
    // }

    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(canWinNim(n));
    }
}