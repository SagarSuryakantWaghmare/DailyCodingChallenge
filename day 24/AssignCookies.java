
import java.util.*;
public class AssignCookies {
    static int FindCookies(int[]g,int[]s){
        int i=0,j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
              i++;  
            }
            j++;
        }
        return i;

    }
   public static void main(String[] args) {
    int g[]={1,2,3};
    int s[]={1,1};
    System.out.println("The best cookie:"+FindCookies(g, s));
    
   } 
}
