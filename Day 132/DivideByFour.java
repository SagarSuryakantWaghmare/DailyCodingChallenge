import java.util.ArrayList;
import java.util.List;

/**
 * DivideByFour
 */
public class DivideByFour {
    public static void divideByFour(ArrayList<Integer>arr){
        for(int i=0;i<arr.size();i++){
            int d=arr.get(i)/4;
            if(d==0){
                arr.set(i, -1);
            }
            else{
                arr.set(i, d);
            }

        }
    }

    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(2);
        numbers.add(16);
        System.out.println(numbers);
        System.out.println("After doing the methods:");
        divideByFour(numbers);
        System.out.println(numbers);

    }
}