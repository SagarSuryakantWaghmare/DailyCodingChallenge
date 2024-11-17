import java.util.Arrays;

public class BoatsToSavePeople {
    public static int boatRequired(int []people,int limit){
        int boats=0;
        Arrays.sort(people);
        int low=0;
        int high=people.length-1;
        while (low<high) {
            if(people[low]+people[high]<=limit){
                
                low++;
                high--;
            }
            else{

                high--;
            }
            
            boats++;
        }
        return boats;
    }

    public static void main(String[] args) {
        int people[]={1,2,3,2,2,3};
        int limit=3;
        System.out.println("Number of the boats required:"+boatRequired(people,limit));
    }
}