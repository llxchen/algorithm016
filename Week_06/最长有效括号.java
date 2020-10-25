//给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
//
// 示例 1:
//
// 输入: "(()"
//输出: 2
//解释: 最长有效括号子串为 "()"
//
//
// 示例 2:
//
// 输入: ")()())"
//输出: 4
//解释: 最长有效括号子串为 "()()"
//
// Related Topics 字符串 动态规划
// 👍 1036 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    /**
     * 第i个字符是左括号"("，那么以他结尾的是构不成有效括号的，所以dp[i]==0;
     * 第i个字符是右括号")"，那么以他结尾的是有可能构成有效括号的，所以还需要判断
     * 类似于这种……()，我们需要判断第i-1个字符是不是"("，如果是的话，那么最长有效括号
     * 就是第i-2个字符之前构成的最长有效括号+2，也就是dp[i]=dp[i-2]+2。
     * 类似于这种……((……))，我们看一下下面的图来看下，所以我们要判断第i -1- dp[i - 1]个
     * 字符是否是"(",如果是，那么递推公式是dp[i]=dp[i] = dp[i - 1] + 2 + dp[i - dp[i - 1] - 2],
     * 这里dp[i - dp[i - 1] - 2]是第一个省略号构成的有效括号
     * @param s
     * @return
     */
    public int longestValidParentheses(String s) {
        int max = 0;
        s = "  " + s;
        int dp[] = new int[s.length()];
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = dp[i - 2] + 2;
                } else if (s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + 2 + dp[i - dp[i - 1] - 2];
                }
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
