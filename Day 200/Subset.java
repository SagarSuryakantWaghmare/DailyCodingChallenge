import java.util.*;
public class Subset {
    public static List<List<Integer>> subsets(int[]nums){
        List<List<Integer>> res=new ArrayList<>();
        generateSubsets(0,nums,new ArrayList<>(),res);
        return res;
    }

    public static void generateSubsets(int index,int[]nums,List<Integer>current,List<List<Integer>>res){
     res.add(new ArrayList<>(current));
     for(int i=index;i<nums.length;i++){
       current.add(nums[i]);
       generateSubsets(i+1, nums, current, res);
       current.remove(current.size()-1);
     }
    }

    public static void main(String[] args) {
        int []nums={1,2,3};
        System.out.println(subsets(nums));
    }
}