
import java.util.*;

public class FirstNegative {
 


    // GeeksforGeeks
    // First negative in each window
    public long[] printFirstNegativeInteger(long a[], int n, int k) {
    long[]res =new long[n-k+1];
    Queue<Integer> q=new LinkedList<>();
    //Traverse the array and add indices of negative numbers
    for(int i=0;i<n;i++){
        if(a[i]<0){
            q.add(i);
        }
    }

    // Iterate over each window of size k
    for(int i=0;i<n-k+1;i++){
        // remove indices that are out of the current
        while (!q.isEmpty()&&q.peek()<i) {
            q.remove();
        }
        // check if the current window to get a negative
        if(!q.isEmpty()&&q.peek()<i+k){
            res[i]=a[q.peek()];
        }
        else{
            res[i]=0;
        }
    }
    return res;
    }

    public static void main(String[] args) {
        FirstNegative fn = new FirstNegative();
        
        long[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int n = arr.length;
        int k = 3;
        
        long[] result = fn.printFirstNegativeInteger(arr, n, k);
        
        System.out.println("First negative integer in each window of size " + k + ":");
        for (long num : result) {
            System.out.print(num + " ");
        }
    }
}


