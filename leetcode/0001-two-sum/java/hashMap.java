class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (indices.containsKey(complement)) {
                return new int[] {indices.get(complement), i};
            }
            indices.put(nums[i], i);
        }
        
        return new int[]{}; 
    }
}