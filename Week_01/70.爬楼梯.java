/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 * 标签：动态规划
 * 本问题其实常规解法可以分成多个子问题，爬第n阶楼梯的方法数量，等于 2 部分之和
 *
 * 爬上 n-1n−1 阶楼梯的方法数量。因为再爬1阶就能到第n阶
 * 爬上 n-2n−2 阶楼梯的方法数量，因为再爬2阶就能到第n阶
 * 所以我们得到公式 dp[n] = dp[n-1] + dp[n-2]dp[n]=dp[n−1]+dp[n−2]
 * 同时需要初始化 dp[0]=1dp[0]=1 和 dp[1]=1dp[1]=1
 * 时间复杂度：O(n)O(n)
 *
 * 下面去掉数组,优化空间复杂度
 *
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if(n < 2) return n;
        int first = 1,second = 1, res = 0;
        for (int i = 2; i <= n; i++) {
            res = first + second;
            first = second;
            second = res;
        }
        return res;
    }
}
// @lc code=end

