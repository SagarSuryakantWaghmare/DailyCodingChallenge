import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
public class IntersectionOfTwoArrays {
    public static int [] intersection(int []num1,int []num2){
        // sort the arrays 
        Arrays.sort(num1);
        Arrays.sort(num2);
        // Make the hashset
        int i=0;
        int j=0;
        Set<Integer> set=new HashSet<>();
        while(i<num1.length && j<num2.length){
            if(num1[i]<num2[j]){
                i++;
            }
            else if(num1[i]>num2[j]){
                j++;
            }
            else{
                set.add(num1[i]);
                i++;
                j++;
            }
        }
        int result[]=new int[set.size()];
        int k=0;
        for(int num:set){
            result[k++]=num;
        }
        return result;

    }

    public static void main(String[] args) {
        // We are given about the two arrays to find the intersection between the two arrays we make a hashset

        int num1[]={1,2,2,1};
        int num2[]={2,2};
        int ans[]=intersection(num1,num2);
        System.out.println("The intersection of the two arrays is:");
        for (int i : ans) {
            System.out.print(i+"");
        }

    }
}