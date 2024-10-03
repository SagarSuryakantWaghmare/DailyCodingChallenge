import java.util.Arrays;

/**
 * TargetBooks
 */
public class TargetBooks {
    private static boolean read(int []books,int read){
        int n=books.length;
        Arrays.sort(books);
        int left=0;
        int right=n-1;
        while (left<=right) {
            int total=books[left]+books[right];
            if(total==read){
                return true;
            }
            else if(total<read){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int []books={1,2,3,1,4,6,2,1,2};
        int read=8;
        System.out.println(read(books,read));

    }
}