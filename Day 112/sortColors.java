import java.util.*;
public class sortColors {
    public static void sortcolors(int []color){
        Arrays.sort(color);
    }
    public static void main(String[] args) {
        int []color={5,0,1,2,2,1,0,4,2,4};
        for (int i : color) {
            System.out.print(i+" ");
        }
        sortcolors(color);
        System.out.println();
        System.out.println("Color after sorting :");
        for (int i : color) {
            System.out.print(i+" ");
        }
    }
}
