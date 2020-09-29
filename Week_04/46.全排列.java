/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

//
//  自下而上
//  code flow
//  start = 0, permutation = []
//  i = 0, newPermutation = [1]
//  	    start = 1, permutation = [1]
//  	    i = 0, newPermutation = [2, 1]
//  		    start = 2, permutation = [2, 1]
//  		    i = 0, newPermutation = [3, 2, 1]
//  		    i = 1, newPermutation = [2, 3, 1]
//  		    i = 2, newPermutation = [2, 1, 3]
//  	    i = 1, newPermutation = [1, 2]
//  		    start = 2, permutation = [1, 2]
//  		    i = 0, newPermutation = [3, 1, 2]
//  		    i = 1, newPermutation = [1, 3, 2]
//  		    i = 2, newPermutation = [1, 2, 3]
//  
class Solution {
    public List<List<Integer>> permute(final int[] nums) {
        final List<List<Integer>> permutations = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<Integer>(), permutations);
        return permutations;
    }

    private void backtrack(int[] nums, int start, List<Integer> permutation, List<List<Integer>> permutations) {
        if (permutation.size() == nums.length) {
            permutations.add(new ArrayList<>(permutation));
            return;
        }
        for (int i = 0; i <= permutation.size(); i++) {
            List<Integer> newPermutation = new ArrayList<>(permutation);
            newPermutation.add(i, nums[start]);
            backtrack(nums, start + 1, newPermutation, permutations);
            /**
             * 方式2: 如果不创建新实例,需要reset state permutation.add(i, nums[start]); Backtrack(nums,
             * start + 1, permutation, permutations); permutation.remove(i);
             *
             */
        }
    }
}
// @lc code=end
