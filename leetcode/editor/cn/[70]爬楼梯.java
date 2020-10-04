//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。 
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 注意：给定 n 是一个正整数。 
//
// 示例 1： 
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶 
//
// 示例 2： 
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
// 
// Related Topics 动态规划 
// 👍 1260 👎 0


//leetcode submit region begin(Prohibit modification and deletion)


import java.util.Map;

class Solution {
    /**
     * 动态规划
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int first = 1, second = 1, res = 0;
        for (var i = 2; i <= n; i++) {
            res = first + second;
            first = second;
            second = res;
            System.out.println("");
        }
        return res;
    }

//    private Map<Integer, Integer> kvs = new HashMap<Integer, Integer>();
//
//    /**
//     * 递归,使用HashMap做缓存
//     *
//     * @param n
//     * @return
//     */
//    public int climbStairs(int n) {
//        if (n <= 2) return n;
//        int firstVal = kvs.getOrDefault(n - 1, 0);
//        int secondVal = kvs.getOrDefault(n - 2, 0);
//        if (firstVal == 0) {
//            firstVal = climbStairs(n - 1);
//            kvs.put(n - 1, firstVal);
//        }
//        if (secondVal == 0) {
//            secondVal = climbStairs(n - 2);
//            kvs.put(n - 2, secondVal);
//        }
//        return firstVal + secondVal;
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
