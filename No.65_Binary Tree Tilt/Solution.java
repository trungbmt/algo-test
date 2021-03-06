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
	int result=0;
	public int findTilt(TreeNode root) {
		findNum(root);
		return this.result;
	}
	public int findNum(TreeNode root) {
		if(root==null) return 0;
		int findLeft = findNum(root.left);
		int findRight = findNum(root.right);
		result+= Math.abs(findLeft- findRight);
		return root.val+findLeft+findRight;
	}
}