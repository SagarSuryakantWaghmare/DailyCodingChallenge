import java.util.HashSet;

import org.xml.sax.SAXException;

public class longestConsectutive {
    public static int longestConsectutive(int []arr){
        HashSet<Integer> st=new HashSet<>();
        for(int num:arr){
            st.add(num);
        }
        int longestStreak=0;
        for(int num:st){
            if(!st.contains(num-1)){
                int curr=num;
                int streak=1;
                while (st.contains(curr+1)) {
                    curr+=1;
                    streak+=1;  
                }
                longestStreak=Math.max(streak,longestStreak);
            }
        }
        return longestStreak;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsectutive(arr));
    }
}