public class GuessNumber {

    protected int guess(int num) { // Change to protected for overriding
        return 0; 
    }

    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = guess(mid);
            
            if (result == 0) {
                return mid;
            } else if (result == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return -1; 
    }

    public static void main(String[] args) {
        int n = 100; 
        int pickedNumber = 42; 

        GuessNumber game = new GuessNumber() {
            @Override
            protected int guess(int num) { 
                if (num == pickedNumber) {
                    return 0;
                } else if (num > pickedNumber) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };

        int result = game.guessNumber(n);
        System.out.println("Guessed Number: " + result);
    }
}
