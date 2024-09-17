/*228. Summary Ranges

You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
 

Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7" */

import java.util.ArrayList;

/**
 * summaryRanges
 */
public class summaryRanges {

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        ArrayList<String> result= summaryRanges(nums);
        for (String s : result) {
            System.out.println(s);
            }
    }

    private static ArrayList<String> summaryRanges(int[] nums) {
        ArrayList<String> ranges=new ArrayList<>();
        if(nums==null||nums.length==0){
            return ranges;
        }
        int start=nums[0];
        int end=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==end+1){
                 end=nums[i];
            }
            else{
                if(start==end){
                    ranges.add(String.valueOf(start));
                }
                else{
                    ranges.add(start+"->"+end);
                }
                start=nums[i];
                end=nums[i];
            }
        }
        if(start==end){
            ranges.add(String.valueOf(start));
        }
        else{
            ranges.add(start+"->"+end);
        }
        return ranges;
    }
}