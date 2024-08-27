class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = 0; i1 < nums.length; i1++) {
                if (i == i1) continue;
                if (nums[i] + nums[i1] == target) return new int[]{i, i1};
            }
        }

        return new int[2];
    }
}