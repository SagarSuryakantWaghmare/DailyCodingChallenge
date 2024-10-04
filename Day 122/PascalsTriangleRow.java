import java.util.ArrayList;
import java.util.List;

/**
 * Pascal'sTriangleRow
 */
public class PascalsTriangleRow {
    public static List<Integer> getRow(int rowIndex){
        List<Integer> line = new ArrayList<>();
        line.add(1);
        for(int i=1; i<=rowIndex; i++){
            List<Integer> tempList = new ArrayList<>();
            tempList.add(1);
            for(int j=1; j<i; j++){
                tempList.add(line.get(j-1) + line.get(j));
            }
            tempList.add(1);
            line = tempList;
        }
        return line;
    }

    public static void main(String[] args) {
        int n = 5;
        List<Integer> ans = getRow(n);
        System.out.println(ans);
    }
}