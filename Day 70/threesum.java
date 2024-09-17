import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3sum
 */
public class threesum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        // sort the array to use two pointers
        for (int i = 0; i < nums.length - 2; i++) {
            // skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int low = i + 1;
            int high = nums.length - 1;
            int target = -nums[i];
            while (low < high) {
                int sum = nums[low] + nums[high];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    // skip duplicates elements for the low pointer
                    while (low < high && nums[low] == nums[low + 1]) {
                        low++;
                    }
                    // skip duplicates elements for the high pointer
                    while (low < high && nums[high] == nums[high - 1]) {
                        high--;
                    }
                    low++;
                    high--;
                } else if (sum < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // 3 sum
        // given an integer array nums, return all the triplets
        // nums[i],nums[j]and nums[k]
        // such that i != j, i != k and j != k
        // and nums[i] + nums[j] + nums[k] == 0
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));

    }

}