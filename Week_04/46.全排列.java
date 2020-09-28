import java.awt.List;
import java.security.Permission;
import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

/**
 * 自下而上
 */
// @lc code=start
class Solution {
    public List<List<Integer>> permute(final int[] nums) {
        final List<List<Integer>> permutations = new ArrayList<>();
        Backtrack(nums, 0, new ArrayList<Integer>(), permutations);
        return permutations;
    }

    private void Backtrack(int[] nums, int start, List<Integer> permutation,
            List<List<Integer>> permutations) {
        if (permutation.size() == nums.length) {
            permutations.add(new ArrayList<>(permutation));
            return;
        }
        for (int i = 0; i <= permutation.size(); i++) {
            List<Integer> newPermutation = new ArrayList<>(permutation);
            newPermutation.add(i, nums[start]);
            Backtrack(nums, start + 1, newPermutation, permutations);
            /**
             * 方式2: 如果不创建新实例,需要reset state
             * permutation.add(i, nums[start]);
             * Backtrack(nums, start + 1, permutation, permutations);
             * permutation.remove(i);
             *
             */
        }
    }
}
// @lc code=end

