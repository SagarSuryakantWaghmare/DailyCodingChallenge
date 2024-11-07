// Assign the cookies to the childeren

import java.util.Arrays;

public class AssignCookies {
    public static int assignCookies(int []g,int []s){
        int i=0;
        int j=0;
        Arrays.sort(s);
        Arrays.sort(g);
        while(i<g.length&&j<s.length){
            if(s[i]>=g[j]){
                j++;
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int g[]={1,2,3};
        int s[]={1,2};
        System.out.println(assignCookies(g,s));
    }
}