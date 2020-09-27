import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=236 lang=java
 *
 * [236] 二叉树的最近公共祖先
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;
        //检查左节点
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        //检查右节点
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        //如果不在右节点下,必在左节点中,返回左节点
        if (right == null)
            return left;
        //如果不在左节点下,必在右节点中,返回右节点
        if (left == null)
            return right;
        //如果在左右节点中,返回当前节点
        return root;
    }
}
// @lc code=end

