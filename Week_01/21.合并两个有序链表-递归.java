/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 *
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/description/
 *
 * algorithms
 * Easy (64.20%)
 * Likes:    1259
 * Dislikes: 0
 * Total Accepted:    364.6K
 * Total Submissions: 567.1K
 * Testcase Example:  '[1,2,4]\n[1,3,4]'
 *
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * 
 * 
 * 
 * 示例：
 * 
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * 
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 *
 * public class ListNode { int val; ListNode next;
 * 
 * ListNode() { }
 * 
 * ListNode(int val) { this.val = val; }
 * 
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; } }
 *
 * 1. 递归 a. 以节点是否为null为递归结束条件，要比较两个链表的节点 b.
 * 思路为先从两个链表头开始比较，将小的排前面，再比较小的节点的Next与另一链表当前节点，递归处理
 * 
 * 2. 时间复杂度，取决两个链表的长度，O(N + M), N,M是两个链表的长度 3. 空间复杂度：???
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;

        final ListNode res = new ListNode(0);
        ListNode currNode = res;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                currNode.next = l1;
                l1 = l1.next;
            } else {
                currNode.next = l2;
                l2 = l2.next;
            }
            currNode = currNode.next;
        }
        currNode.next = l1 != null ? l1 : l2;
        return res.next;
    }
}
// @lc code=end
