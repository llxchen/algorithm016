import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 *
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/description/
 *
 * algorithms
 * Medium (73.59%)
 * Likes:    718
 * Dislikes: 0
 * Total Accepted:    268.8K
 * Total Submissions: 365.1K
 * Testcase Example:  '[1,null,2,3]'
 *
 * 给定一个二叉树，返回它的中序 遍历。
 * 
 * 示例:
 * 
 * 输入: [1,null,2,3]
 * ⁠  1
 * ⁠   \
 * ⁠    2
 * ⁠   /
 * ⁠  3
 * 
 * 输出: [1,3,2]
 * 
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
// 中序遍历，左->根->右
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList res = new ArrayList<Integer>();
        if (root == null)
            return res;
        Traversal(root, res);
        return res;
    }

    private void Traversal(TreeNode node, ArrayList<Integer> result) {
        if (node == null)
            return;
        Traversal(node.left, result);
        result.add(node.val);
        Traversal(node.right, result);
    }
}
// @lc code=end
