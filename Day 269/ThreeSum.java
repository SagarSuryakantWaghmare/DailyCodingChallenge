import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = { -1, -2, 3, 4, 5, -3, 10 };
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int low = i + 1;
            int high = nums.length - 1;
            int target = -nums[i];
            while (low < high) {
                int sum = nums[low] + nums[high];
                if (target == sum) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while (low < high && nums[low] == nums[low + 1]) {
                        low++;
                    }
                    while (low < high && nums[high] == nums[high - 1]) {
                        high--;
                    }
                    low++;
                    high--;
                } else if (target < sum) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return result;
    }
}
