class Solution {
    // Time Complexity: O(n)
    // Space Complexity O(n)
    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer, Integer> goodPairs = new HashMap<>();
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (goodPairs.containsKey(nums[i])) {
                counter += goodPairs.get(nums[i]);
            } 
            goodPairs.put(nums[i], goodPairs.getOrDefault(nums[i], 0) + 1); 
        }

        return counter;
    }
}