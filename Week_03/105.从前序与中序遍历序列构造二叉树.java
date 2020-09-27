import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
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
    int pre = 0;
    int in = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, (long) Integer.MAX_VALUE);
    }

    /**
     * Test case:
     * 前序遍历 preorder = [3,9,20,15,7]
     * 中序遍历 inorder = [9,3,15,20,7]
     */
    private TreeNode buildTree(int[] preorder, int[] inorder, long stop) {
        //前序遍历已至末尾，返回null
        if (pre == preorder.length)
            return null;
        //如果中序值等于停止值，返回null
        if (inorder[in] == stop) {
            in++;
            return null;
        }
        int rootVal = preorder[pre++];
        TreeNode root = new TreeNode(rootVal);
        /**
         * 例如首次递归，前序index=0,值为3，为根节点
         * 在中序遍历中，3前面应为左子树，3之后为右子树，所以3为left递归的stop
         * 依次递归下去...
         */
        root.left = buildTree(preorder, inorder, rootVal);
        root.right = buildTree(preorder, inorder, stop);
        return root;
    }
}
// @lc code=end

