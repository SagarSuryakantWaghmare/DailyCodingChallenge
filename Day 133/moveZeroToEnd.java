import java.util.ArrayList;

/**
 * moveZeroToEnd
 */
public class moveZeroToEnd {
    public static void  moveToEnd(ArrayList<Integer> a){

        int j=0;
        for(int i=0;i<a.size()-1;i++){
            if(a.get(i)!=0){
                a.set(j, a.get(i));
                j++;
            }
        }
        for (int k = j; k < a.size(); k++) {
            a.set(k, 0);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(0);
        a.add(1);
        a.add(0);
        a.add(3);
        a.add(12);
        a.add(0);
        a.add(0);
        System.out.println("Original List: "+a);
        moveToEnd(a);
        System.out.println("List after moving zeros to end: "+a);

    }
}