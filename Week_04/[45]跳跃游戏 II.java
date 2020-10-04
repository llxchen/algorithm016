//给定一个非负整数数组，你最初位于数组的第一个位置。 
//
// 数组中的每个元素代表你在该位置可以跳跃的最大长度。 
//
// 你的目标是使用最少的跳跃次数到达数组的最后一个位置。 
//
// 示例: 
//
// 输入: [2,3,1,1,4]
//输出: 2
//解释: 跳到最后一个位置的最小跳跃数是 2。
//     从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
// 
//
// 说明: 
//
// 假设你总是可以到达数组的最后一个位置。 
// Related Topics 贪心算法 数组 
// 👍 708 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int jump(int[] nums) {
//        int length = nums.length;   //数据总长度
//        int maxPosition = 0;    //当前跳跃范围内最大的点
//        int steps = 0;  //跳跃步骤
//        int end = 0;    //当前跳跃结束索引点
//        for (int i = 0; i < length - 1; i++) {
//            //在跳跃范围内取可跳跃最大的点
//            maxPosition = Math.max(maxPosition, i + nums[i]);
//            //当前可跳跃范围结束时，取最大可跳跃的点更新至end,并增加一个步骤
//            if (i == end) {
//                end = maxPosition;
//                steps++;
//            }
//        }
//        return steps;
//    }
//}
/*
 *  方法2，while循环更直观:
 *　furthest to record the furthest place previous step can reach
 *  max to record the furthest place current step can reach.
 *  result to record the minimum step we need to reach the last place.
 *  Traverse the array to update max. Update furthest with max and result with result + 1 each time current place reach the furthest. Keep traversing until we reach the last place.
 */

class Solution {
    public int jump(int[] nums) {
        int furthest = 0, result = 0, i = 0;
        while (i < nums.length && furthest < nums.length - 1) {
            int max = 0;
            while (i <= furthest) {
                max = Math.max(max, nums[i] + i);
                i++;
            }
            furthest = max;
            result++;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
