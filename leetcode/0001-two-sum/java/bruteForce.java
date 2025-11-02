class Solution {
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public int[] twoSum(int[] nums, int target) {

        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return indices = new int[]{i, j};
                }
            }
        }
        
        return indices;
    }
}