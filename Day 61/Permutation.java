import java.util.ArrayList;
import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> permutations = permute(nums);
        System.out.println(permutations);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] isValid = new boolean[nums.length];
        helper(nums, ds, isValid, ans);
        return ans;
    }

    public static void helper(int[] nums, List<Integer> ds, boolean[] isValid, List<List<Integer>> ans) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!isValid[i]){
                ds.add(nums[i]);
                isValid[i]=true;
                helper(nums, ds, isValid, ans);
                isValid[i]=false;
                ds.remove(ds.size()-1);
            }
        }
    }
}
