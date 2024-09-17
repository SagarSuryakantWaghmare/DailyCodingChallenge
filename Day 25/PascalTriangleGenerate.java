
import java.util.*;
public class PascalTriangleGenerate {
    static List<Integer> getRow(int rowIndex){
        List<Integer> row=new ArrayList<>();
        row.add(1);
        // here 1
        for(int i=1;i<=rowIndex;i++){
            //4
            for(int j=row.
            size()-1;j>0;j--){
                
                //4 .3+1 
                // [1,3,3,1]
               row.set(j,row.get(j)+row.get(j-1));
            }
            row.add(1);
        }
        return row;
    } 
  public static void main(String[] args) {
    int rowIndex=4;
    System.out.println(getRow(4));
    //output=[1, 4, 6, 4, 1]
  }  
}
