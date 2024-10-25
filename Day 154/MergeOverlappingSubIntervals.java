import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * MergeOverlappingSubIntervals
 */
public class MergeOverlappingSubIntervals {
    public static List<List<Integer>> merge(List<List<Integer>>arr){
        Collections.sort(arr,(a,b)->a.get(0)-b.get(0));
        List<List<Integer>> ans=new ArrayList<>();
        // Brute force approach
        for (int i = 0; i < arr.size(); i++) {
            int start=arr.get(i).get(0);
            int end=arr.get(i).get(1);
            
            if(ans.isEmpty()||ans.get(ans.size()-1).get(1)<start){
                ans.add(Arrays.asList(start,end));
            }
            else{
                ans.get(ans.size()-1).set(1, Math.max(ans.get(ans.size()-1).get(1), end));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
       List<List<Integer>> intervals = new ArrayList<>();
        intervals.add(Arrays.asList(1, 3));
        intervals.add(Arrays.asList(2, 6));
        intervals.add(Arrays.asList(8, 9));
        intervals.add(Arrays.asList(2, 4));
        intervals.add(Arrays.asList(15, 18));
        intervals.add(Arrays.asList(16, 17));
        List<List<Integer>> mergedIntervals = merge(intervals);

        for (List<Integer> interval : mergedIntervals) {
            System.out.println(interval);
        } 
    }
}