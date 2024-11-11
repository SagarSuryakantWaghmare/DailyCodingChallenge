import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static int distributeCandies(int [] candyType){
        Set<Integer> set=new HashSet<>();
        for(int candy:candyType){
            set.add(candy);
        }
        int candyEat=Math.min(set.size(), candyType.length/2);
        return candyEat;
    }

    public static void main(String[] args) {
        int [] candyType = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }
}