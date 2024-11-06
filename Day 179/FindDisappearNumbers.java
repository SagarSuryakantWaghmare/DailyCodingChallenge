import java.util.ArrayList;
import java.util.List;

public class FindDisappearNumbers {
    public static List<Integer> findDisappearedIntegers(int []nums){
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index]=-nums[index];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result.add(i+1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};
        int n = arr.length;
        System.out.println("The missing numbers are: ");
        // Store in the from of the list
        List<Integer> list = findDisappearedIntegers(arr);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}