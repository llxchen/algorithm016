<<<<<<< HEAD
=======
import javax.swing.tree.TreeNode;

>>>>>>> a41935f8261727863f093f0d851430dfd5e363e3
/*
 * @lc app=leetcode.cn id=236 lang=java
 *
 * [236] 二叉树的最近公共祖先
<<<<<<< HEAD
 *
 * https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
 *
 * algorithms
 * Medium (65.36%)
 * Likes:    756
 * Dislikes: 0
 * Total Accepted:    123K
 * Total Submissions: 188.1K
 * Testcase Example:  '[3,5,1,6,2,0,8,null,null,7,4]\n5\n1'
 *
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * 
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x
 * 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 * 
 * 例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]
 * 
 * 
 * 
 * 
 * 
 * 示例 1:
 * 
 * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * 输出: 3
 * 解释: 节点 5 和节点 1 的最近公共祖先是节点 3。
 * 
 * 
 * 示例 2:
 * 
 * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
 * 输出: 5
 * 解释: 节点 5 和节点 4 的最近公共祖先是节点 5。因为根据定义最近公共祖先节点可以为节点本身。
 * 
 * 
 * 
 * 
 * 说明:
 * 
 * 
 * 所有节点的值都是唯一的。
 * p、q 为不同节点且均存在于给定的二叉树中。
 * 
 * 
=======
>>>>>>> a41935f8261727863f093f0d851430dfd5e363e3
 */

// @lc code=start
/**
<<<<<<< HEAD
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
=======
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
>>>>>>> a41935f8261727863f093f0d851430dfd5e363e3
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;
<<<<<<< HEAD
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null) {// 如果左节点不是祖先，返回右节点
            return right;
        } else if (right == null) { // 如果右节点不是祖先，返回左节点
            return left;
        } else { // 如果左右节点都能找到p,q,返回当前节点
            return root;
        }
    }
}
// @lc code=end
=======
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

>>>>>>> a41935f8261727863f093f0d851430dfd5e363e3
