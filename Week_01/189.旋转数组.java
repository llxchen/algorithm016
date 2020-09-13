/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 *
 * https://leetcode-cn.com/problems/rotate-array/description/
 *
 * algorithms
 * Easy (42.97%)
 * Likes:    690
 * Dislikes: 0
 * Total Accepted:    162.8K
 * Total Submissions: 378.8K
 * Testcase Example:  '[1,2,3,4,5,6,7]\n3'
 *
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 
 * 示例 1:
 * 
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 
 * 
 * 示例 2:
 * 
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释: 
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 
 * 说明:
 * 
 * 
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的 原地 算法。
 * 
 * 
 */

/*
Test Case: nums=[1,2,3,4,5,6,7], k=3
    数组可看成两段：［1,2,3,4] index: 0-3(nums.length-k),[5,6,7]=4-7(nums.length-k,nums.length)
    1. 循环遍历：从0 -> 4(len - k)，根据Key值
    a. nums = 1,2,3,4,5,6,7; k = 3; swap=0; len-k（7－3） = 4; result: 5,2,3,4,1,6,7
       nums = 5,2,3,4,1,6,7; k = 3; swap=1; len-k（7－2） = 5; result: 5,6,3,4,1,2,7
       nums = 5,6,3,4,1,2,7; k = 3; swap=2; len-k（7－1） = 6; result: 5,6,7,4,1,2,3


*/
// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        for(var i = 0; i < )
        while (swap  < len - k) {
            // if (swap < k) {
            var temp = nums[swap];
            nums[swap] = nums[len - k];
            System.out.println("len-k: " + (len - k) + ", value = " + nums[len - k] + ", swap:" + swap + ", k=" + k);
            nums[len - k--] = temp;
            swap++;
            // }
        }
        System.out.println("swap: " + swap);
    }
}
// @lc code=end
