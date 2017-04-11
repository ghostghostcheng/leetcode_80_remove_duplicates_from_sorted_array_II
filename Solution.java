package leetcode_80_remove_duplicates_from_sorted_array_II;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        
        int counter = 1;
        int idx = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                counter++;
            } else {
                counter = 1;
            }
            
            if (counter < 3) {
                idx++;
                nums[idx] = nums[i];
            }
        }
        
        return idx + 1;
    }
}