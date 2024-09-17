// so we have to go end in less time
/**
 * JumpGame2
 */
public class JumpGame2 {

    public static void main(String[] args) {
       int arr[]={2,3,1,1,4};
       System.out.println(JumpGame(arr));
    }

    private static int JumpGame(int[] arr) {
        int n=arr.length;
        int currFar=0;
        int currEnd=0;
        int jump=0;
        for (int i = 0; i < n-1; i++) {
            currFar=Math.max(currFar,i+arr[i]);
            if(i==currEnd){
                jump++;
                currEnd=currFar;
            }   
        }
       return jump; 
    }
}