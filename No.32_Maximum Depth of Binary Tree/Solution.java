/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
	public int maxDepth(TreeNode root) {
		return getMaxDepth(root,1);
		
	}
	public int getMaxDepth(TreeNode root, int countdeep) {
		if(root==null) return 0;
		if(root.left==null&&root.right==null) return countdeep;
		else if(root.left==null) return getMaxDepth(root.right, countdeep+1);
		else if(root.right==null) return getMaxDepth(root.left, countdeep+1);
		return Math.max(getMaxDepth(root.left, countdeep+1), getMaxDepth(root.right, countdeep+1));
	}
}